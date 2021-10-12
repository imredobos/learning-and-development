package com.agiledeveloper.airportstatus

import io.kotlintest.specs.StringSpec
import io.kotlintest.shouldBe
import io.kotlintest.data.forall
import io.kotlintest.tables.row
import io.kotlintest.TestCase
import io.kotlintest.TestResult
import io.mockk.*
import kotlinx.coroutines.*

class AirportStatusTest : StringSpec() {
  val iad = Airport("IAD", "Dulles", true)
  val iah = Airport("IAH", "Houston", false)
  val inv = Airport("inv", "Invalid Airport", false)

  override fun beforeTest(testCase: TestCase) {
    mockkObject(Airport)
    every { Airport.getAirportData("IAD") } returns iad
    every { Airport.getAirportData("IAH") } returns iah
    every { Airport.getAirportData("inv") } returns inv
  }
  
  override fun afterTest(testCase: TestCase, result: TestResult) {
    clearAllMocks()
  }

  init {
    "getAirportStatus returns status for airports in sorted order" {
      forall(
        row(listOf<String>(), listOf<Airport>()),
        row(listOf("IAD"), listOf(iad)),
        row(listOf("IAD", "IAH"), listOf(iad, iah)),
        row(listOf("IAH", "IAD"), listOf(iad, iah)),
        row(listOf("inv", "IAD", "IAH"), listOf(iad, iah, inv))
      ) { input, result ->
          runBlocking { getAirportStatus(input) shouldBe result }
        }
    }

    "getAirportStatus runs in the Dispatcher.IO context" {
      
       mockkStatic("kotlinx.coroutines.BuildersKt__Builders_commonKt")
      
       coEvery {
         withContext<List<Airport>>(
           context = Dispatchers.IO, block = captureCoroutine())
       } answers { 
         listOf(iah)
       }                                                    
              
       getAirportStatus(listOf("IAH")) shouldBe listOf(iah)
       
       coVerify {
         withContext<List<Airport>>(Dispatchers.IO, block = any())
       }
    }
     
    "getAirportStatus calls getAirportData asynchronously" {

       mockkStatic("kotlinx.coroutines.BuildersKt__Builders_commonKt")

       coEvery {
         any<CoroutineScope>().async<Airport>(
           context = any(), block = captureCoroutine())
       } answers { 
         CompletableDeferred(iad)
       }                                                    
                                                               
       getAirportStatus(listOf("IAD")) shouldBe listOf(iad)
    
       coVerify {
         any<CoroutineScope>().async<Airport>(context = any(), block = any())
       }
    }
  }
}
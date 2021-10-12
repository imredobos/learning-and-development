package com.agiledeveloper.airportstatus

import io.kotlintest.specs.StringSpec
import io.kotlintest.shouldBe
import io.kotlintest.data.forall
import io.kotlintest.tables.row
import io.kotlintest.TestCase
import io.kotlintest.TestResult
import io.mockk.*

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
        row(listOf("IAD"), listOf(iad))        
      ) { input, result ->
          getAirportStatus(input) shouldBe result
        }
    }
  }
}
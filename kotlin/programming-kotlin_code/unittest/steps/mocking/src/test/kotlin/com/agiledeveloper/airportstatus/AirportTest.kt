package com.agiledeveloper.airportstatus

import io.kotlintest.specs.StringSpec
import io.kotlintest.shouldBe
import io.kotlintest.data.forall
import io.kotlintest.tables.row
import io.kotlintest.TestCase
import io.kotlintest.TestResult
import io.mockk.*

class AirportTest : StringSpec() {
  val iah = Airport("IAH", "Houston", true)
  val iad = Airport("IAD", "Dulles", false)
  val ord = Airport("ORD", "Chicago O'Hare", true)

  override fun beforeTest(testCase: TestCase) {
    mockkObject(Airport)
  }
  
  override fun afterTest(testCase: TestCase, result: TestResult) {
    clearAllMocks()
  }

  init {
    "canary test should pass" {
      true shouldBe true
    }
    
    "create Airport" {
      iah.code shouldBe "IAH"
      iad.name shouldBe "Dulles"
      ord.delay shouldBe true
    }

    "sort airports by name" {
      forall(
        row(listOf(), listOf()),
        row(listOf(iad), listOf(iad)),
        row(listOf(iad, iah), listOf(iad, iah)),
        row(listOf(iad, iah, ord), listOf(ord, iad, iah))) { input, result ->
          Airport.sort(input) shouldBe result
      }
    }

    "getAirportData invokes fetchData" {
      every { Airport.fetchData("IAD") } returns
        """{"IATA":"IAD", "Name": "Dulles", "Delay": false}"""
    
      Airport.getAirportData("IAD")
    
      verify { Airport.fetchData("IAD") }
    }

    "getAirportData extracts Airport from JSON returned by fetchData" {
      every { Airport.fetchData("IAD") } returns 
        """{"IATA":"IAD", "Name": "Dulles", "Delay": false}"""

      Airport.getAirportData("IAD") shouldBe iad

      verify { Airport.fetchData("IAD") }
    }
  }
}
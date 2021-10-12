package com.agiledeveloper.airportstatus

import io.kotlintest.specs.StringSpec
import io.kotlintest.shouldBe
import io.kotlintest.data.forall
import io.kotlintest.tables.row
import io.kotlintest.TestCase
import io.kotlintest.TestResult
import io.mockk.*

class AirportStatusTest : StringSpec() {
  init {
    "getAirportStatus returns status for airports in sorted order" {
      forall(
        row(listOf<String>(), listOf<Airport>())
      ) { input, result ->
          getAirportStatus(input) shouldBe result
        }
    }
  }
}
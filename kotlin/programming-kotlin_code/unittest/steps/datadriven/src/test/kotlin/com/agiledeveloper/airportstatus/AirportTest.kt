package com.agiledeveloper.airportstatus

import io.kotlintest.specs.StringSpec
import io.kotlintest.shouldBe
import io.kotlintest.data.forall
import io.kotlintest.tables.row

class AirportTest : StringSpec() {
  val iah = Airport("IAH", "Houston", true)
  val iad = Airport("IAD", "Dulles", false)
  val ord = Airport("ORD", "Chicago O'Hare", true)

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
  }
}
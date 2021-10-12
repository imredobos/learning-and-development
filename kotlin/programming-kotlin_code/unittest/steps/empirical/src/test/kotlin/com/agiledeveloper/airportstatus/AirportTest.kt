package com.agiledeveloper.airportstatus

import io.kotlintest.specs.StringSpec
import io.kotlintest.shouldBe

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

    "sort empty list should return an empty list" {
      Airport.sort(listOf<Airport>()) shouldBe listOf<Airport>()
    }

    "sort list with one Airport should return the given Airport" {
      Airport.sort(listOf(iad)) shouldBe listOf(iad)
    }

    "sort pre-sorted list should return the given list" {
      Airport.sort(listOf(iad, iah)) shouldBe listOf(iad, iah)
    }  

    "sort airports should return airports in sorted order of name" {
      Airport.sort(listOf(iah, iad, ord)) shouldBe listOf(ord, iad, iah)
    }
  }
}
package com.agiledeveloper.airportstatus

data class Airport(val code: String, val name: String, val delay: Boolean) {
  companion object {
    fun sort(airports: List<Airport>) : List<Airport> {
      return airports.sortedBy { it.name }
    }
  }
}

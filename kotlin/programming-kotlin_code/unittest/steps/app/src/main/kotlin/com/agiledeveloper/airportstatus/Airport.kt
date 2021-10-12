package com.agiledeveloper.airportstatus

import com.beust.klaxon.*

data class Airport(
  @Json(name = "IATA") val code: String,
  @Json(name = "Name") val name: String,
  @Json(name = "Delay") val delay: Boolean) {

  companion object {
    fun sort(airports: List<Airport>) : List<Airport> {
      return airports.sortedBy { airport -> airport.name }
    }

    fun getAirportData(code: String) = 
      try {
        Klaxon().parse<Airport>(fetchData(code)) as Airport      
      } catch(ex: Exception) {
        Airport(code, "Invalid Airport", false)
      }

    fun fetchData(code: String) =
      java.net.URL("https://soa.smext.faa.gov/asws/api/airport/status/$code")
        .readText()
  }
}

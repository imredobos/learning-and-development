package com.agiledeveloper.airports

import com.beust.klaxon.*

class Weather(@Json(name = "Temp") val temperature: Array<String>)

data class Airport(
  @Json(name = "IATA") val code: String,
  @Json(name = "Name") val name: String,
  @Json(name = "Delay") val delay: Boolean,
  @Json(name = "Weather") val weather: Weather = Weather(arrayOf(""))) {

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

    private fun fetchData(code: String) =
      java.net.URL("https://soa.smext.faa.gov/asws/api/airport/status/$code")
      .readText()
  }
}

package com.agiledeveloper.airportstatus

suspend fun getAirportStatus(airportCodes: List<String>): List<Airport> =
  Airport.sort(
    airportCodes.map { code -> Airport.getAirportData(code) })

package com.agiledeveloper.airportstatus

fun getAirportStatus(airportCodes: List<String>): List<Airport> =
  Airport.sort(
    airportCodes.map { code -> Airport.getAirportData(code) })

package com.agiledeveloper.airportstatus

fun getAirportStatus(airportCodes: List<String>): List<Airport> =
  airportCodes.map { code -> Airport.getAirportData(code) }

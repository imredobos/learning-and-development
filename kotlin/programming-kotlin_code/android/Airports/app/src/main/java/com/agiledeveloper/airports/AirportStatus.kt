package com.agiledeveloper.airports

import kotlinx.coroutines.*

suspend fun getAirportStatus(airportCodes: List<String>): List<Airport> =
  withContext(Dispatchers.IO) {
    val airports = airportCodes
      .map { code -> async { Airport.getAirportData(code) } }
      .map { response -> response.await() }

    Airport.sort(airports)
  }

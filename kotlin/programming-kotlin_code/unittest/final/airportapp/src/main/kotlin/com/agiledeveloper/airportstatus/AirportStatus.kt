package com.agiledeveloper.airportstatus

import kotlinx.coroutines.*
  
suspend fun getAirportStatus(airportCodes: List<String>): List<Airport> =
  withContext(Dispatchers.IO) {
    Airport.sort(
      airportCodes.map { code -> async { Airport.getAirportData(code) } }
        .map { response -> response.await() }) 
  }
    
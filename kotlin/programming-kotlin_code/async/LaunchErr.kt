import kotlinx.coroutines.*

fun main() = runBlocking {
  try {
    val airportCodes = listOf("LAX", "SF-", "PD-", "SEA")

    val jobs: List<Job> = airportCodes.map { anAirportCode ->
      launch(Dispatchers.IO + SupervisorJob()) {
        val airport = Airport.getAirportData(anAirportCode)
        println("${airport?.code} delay: ${airport?.delay}")
      }
    }

    jobs.forEach { it.join() }
    jobs.forEach { println("Cancelled: ${it.isCancelled}") }
  } catch(ex: Exception) {
    println("ERROR: ${ex.message}")
  }
}

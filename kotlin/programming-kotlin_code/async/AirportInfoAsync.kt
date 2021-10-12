import kotlin.system.*
import kotlinx.coroutines.*

fun main() = runBlocking {                  
  val format = "%-10s%-20s%-10s"
  println(String.format(format, "Code", "Temperature", "Delay"))
  
  val time = measureTimeMillis {
    val airportCodes = listOf("LAX", "SFO", "PDX", "SEA")

    val airportData: List<Deferred<Airport?>> = 
      airportCodes.map { anAirportCode ->
        async(Dispatchers.IO) { 
          Airport.getAirportData(anAirportCode)
        }
      }         

    airportData
      .mapNotNull { anAirportData -> anAirportData.await() }
      .forEach { anAirport -> 
        println(String.format(format, anAirport.code,
        anAirport.weather.temperature.get(0), anAirport.delay))
    }
  }
  
  println("Time taken $time ms")
}
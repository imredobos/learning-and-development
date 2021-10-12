import kotlin.system.*

fun main() {                  
  val format = "%-10s%-20s%-10s"
  println(String.format(format, "Code", "Temperature", "Delay"))
  
  val time = measureTimeMillis {
    val airportCodes = listOf("LAX", "SFO", "PDX", "SEA")

    val airportData: List<Airport> = 
      airportCodes.mapNotNull { anAirportCode ->
        Airport.getAirportData(anAirportCode)
      }         
    
    airportData.forEach { anAirport -> 
      println(String.format(format, anAirport.code,
        anAirport.weather.temperature.get(0), anAirport.delay))
    }
  }
  
  println("Time taken $time ms")
}
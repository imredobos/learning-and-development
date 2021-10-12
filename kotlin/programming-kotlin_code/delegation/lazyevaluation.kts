fun getTemperature(city: String): Double {
  println("fetch from webservice for $city")
  return 30.0
}

val showTemperature = false
val city = "Boulder"

val temperature by lazy { getTemperature(city) }

if (showTemperature && temperature > 20) //(nothing here)
  println("Warm")
else
  println("Nothing to report") //Nothing to report

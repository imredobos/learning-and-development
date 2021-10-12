class Car(val yearOfMake: Int, color: String) {
  var fuelLevel = 100

  var color = color
    set(value) {
      if (value.isBlank()) {
        throw RuntimeException("no empty, please")
      }

      field = value
    }
}

val car = Car(2019, "Red")
car.color = "Green"

println(car.color) //GREEN
println(car.fuelLevel) //100

try {
  car.color = ""
} catch(ex: Exception) {
  println(ex.message) //no empty, please
}

println(car.color) //Green

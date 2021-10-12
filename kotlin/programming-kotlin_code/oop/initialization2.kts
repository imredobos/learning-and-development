class Car(val yearOfMake: Int, theColor: String) {
  var fuelLevel = if (yearOfMake < 2020) 90 else 100
    private set

  var color = theColor
    set(value) {
      if (value.isBlank()) {
        throw RuntimeException("no empty, please")
      }

      field = value
    }

  init {
    //if (yearOfMake < 2020) { fuelLevel = 90 }
  } 
  
  fun drive() {
    fuelLevel--
  }
}

val car = Car(2019, "Red")

println(car.fuelLevel)

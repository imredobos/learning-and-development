class Car(val yearOfMake: Int, theColor: String) {
  var fuelLevel = 100
    private set
  
  var color = theColor
    set(value) {
      if (value.isBlank()) {
        throw RuntimeException("no empty, please")
      }

      field = value
    }
  
  fun drive() {
    fuelLevel--
  }
}

val car = Car(2019, "Red")
println(car.fuelLevel) //100 

//car.fuelLevel = 100 //ERROR

car.drive()
println(car.fuelLevel) //99

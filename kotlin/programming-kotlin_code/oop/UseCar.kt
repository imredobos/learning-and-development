fun useCarObject(): Pair<Int, String> {
  val car = Car(2019, "Red")

  val year = car.yearOfMake

  car.color = "Green"

  val color = car.color
  
  return year to color
}

class Car(val yearOfMake: Int, var color: String)

val car = Car(2019, "Red")
car.color = "Green"
println(car.color) //GREEN
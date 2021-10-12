open class Vehicle(val year: Int, open var color: String) {
  open val km = 0   
  
  final override fun toString() = "year: $year, Color: $color, KM: $km"
  
  fun repaint(newColor: String) {
    color = newColor
  }
}              

open class Car(year: Int, color: String) : Vehicle(year, color) {
  override var km: Int = 0
    set(value) {
      if (value < 1) {
        throw RuntimeException("can't set negative value")
      }

      field = value
    }
  
  fun drive(distance: Int) {
    km += distance
  }  
}                   

val car = Car(2019, "Orange")
println(car.year)  // 2019
println(car.color) // Orange

car.drive(10)
println(car) // year: 2019, Color: Orange, KM: 10

try {
  car.drive(-30)
} catch(ex: RuntimeException) {
  println(ex.message) // can't set negative value
}

class FamilyCar(year: Int, color: String) : Car(year, color) {
  override var color: String
    get() = super.color
    set(value) {
      if (value.isEmpty()) {
        throw RuntimeException("Color required")
      }
      
      super.color = value
    }
}

val familyCar = FamilyCar(2019, "Green")

println(familyCar.color) //Green

try {
  familyCar.repaint("")
} catch(ex: RuntimeException) {
  println(ex.message) // Color required
}

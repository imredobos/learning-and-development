open class Vehicle(val year: Int, open var color: String) {
  open val km = 0   
  
  final override fun toString() = "year: $year, Color: $color, KM: $km"
  
  fun repaint(newColor: String) {
    color = newColor
  }
}              

open class Car(override val year: Int, color: String) : Vehicle(year, color) { //ERROR
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
  
  override fun toString() = "nope" //ERROR  
  
  override fun repaint(newColor: String) {} //ERROR
}                   

class FamilyCar : Car {
  override var km: Int = 0
    private set(value) { //ERROR
      if (value < 1) {
        throw RuntimeException("can't set negative value")
      }

      field = value
    }
  
  override var color: String
    set(value) {
      if (value.isEmpty()) {
        throw RuntimeException("Color required")
      }
      
      field = value
    }
    
  constructor(year: Int, color: String) : super(year, color) {
    this.color = color
  }
  
  override fun drive(distance: Int) {} //ERROR
}

val car = Car(2019, "Orange")
println(car.year)
println(car.color)

car.drive(10)
println(car)

try {
  car.drive(-30)
} catch(ex: RuntimeException) {
  println(ex.message)
}

val familyCar = FamilyCar(2019, "Blue")

println(familyCar.color)                      

familyCar.color = "Gray"

println(familyCar.color)                      

try {
  familyCar.color = ""
} catch(ex: RuntimeException) {
  println(ex.message)
}

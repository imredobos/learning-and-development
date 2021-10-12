data class Circle(val cx: Int, val cy: Int, val radius: Int)

val Circle.area: Double
  get() = kotlin.math.PI * radius * radius

val circle = Circle(100, 100, 25)
println("Area is ${circle.area}") //1963.49...

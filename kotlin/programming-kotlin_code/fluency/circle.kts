data class Point(val x: Int, val y: Int)
data class Circle(val cx: Int, val cy: Int, val radius: Int)

fun Circle.contains(point: Point) = 
  (point.x - cx) * (point.x - cx) + (point.y - cy) * (point.y - cy) < 
    radius * radius

val circle = Circle(100, 100, 25)
val point1 = Point(110, 110)
val point2 = Point(10, 100)

println(circle.contains(point1)) //true
println(circle.contains(point2)) //false

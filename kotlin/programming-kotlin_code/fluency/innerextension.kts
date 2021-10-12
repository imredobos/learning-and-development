class Point(x: Int, y: Int) {
  private val pair = Pair(x, y)

  private val firstsign = if (pair.first < 0) "" else "+"
  private val secondsign = if (pair.second < 0) "" else "+"

  override fun toString() = pair.point2String()
  fun Pair<Int, Int>.point2String() =
    "(${firstsign}${first}, ${this@Point.secondsign}${this.second})"
}

println(Point(1, -3)) //(+1, -3)
println(Point(-3, 4)) //(-3, +4)

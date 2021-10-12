operator fun Pair<Int, Int>.plus(other: Pair<Int, Int>) = 
  Pair(first + other.first, second + other.second)

val pair1 = Pair(1, 2)
val pair2 = Pair(7, -3)

println(pair1 + pair2) // (8, -1)

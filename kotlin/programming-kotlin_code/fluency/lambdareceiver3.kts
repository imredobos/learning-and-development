var length = 100

val printIt: String.(Int, Double) -> Unit = { n: Int, d: Double ->
  println("n is $n, d is $d, length is $length")
}

"Hello".printIt(6, 1.2)

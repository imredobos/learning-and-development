var length = 100

val printIt: String.(Int) -> Unit = { n: Int ->
  println("n is $n, length is $length")
}

printIt("Hello", 6)

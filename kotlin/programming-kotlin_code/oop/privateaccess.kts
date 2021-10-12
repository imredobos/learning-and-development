class Person(val first: String, val last: String) {
  //...
  
  fun fullName() = "$last, $first"
  
  private fun yearsOfService(): Int = throw RuntimeException("Not implemented yet")
}

val jane = Person("Jane", "Doe")
println(jane.fullName())
jane.yearsOfService() //ERROR

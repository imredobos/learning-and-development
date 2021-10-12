class Person(val first: String, val last: String) {
  //...
  
  internal fun fullName() = "$last, $first"
  
  private fun yearsOfService(): Int = 
    throw RuntimeException("Not implemented yet")
}

val jane = Person("Jane", "Doe")
println(jane.fullName()) //Doe, Jane
//jane.yearsOfService() //ERROR: cannot access...private in 'Person'

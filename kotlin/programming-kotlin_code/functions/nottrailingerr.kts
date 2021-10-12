fun greetMany(vararg names: String, msg: String) {
  println("$msg ${names.joinToString(", ")}")
}                                 

greetMany("Tom", "Jerry", "Spike", "Hello") //ERROR
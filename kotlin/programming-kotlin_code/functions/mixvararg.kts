fun greetMany(msg: String, vararg names: String) {
  println("$msg ${names.joinToString(", ")}")
}                                 

greetMany("Hello", "Tom", "Jerry", "Spike") //Hello Tom, Jerry, Spike
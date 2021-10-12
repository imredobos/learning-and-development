class Animal(val age: Int) {
  override operator fun equals(other: Any?):Boolean {
    return if (other is Animal) age == other.age else false
  }
}
              
val odie = Animal(2)
val toto = Animal(2)
val butch = Animal(3)

println(odie == toto) //true
println(odie == butch) //false

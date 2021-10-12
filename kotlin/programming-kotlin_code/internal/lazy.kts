data class Person(val firstName: String, val age: Int)

val people = listOf(
  Person("Sara", 12),
  Person("Jill", 51),
  Person("Paula", 23),
  Person("Paul", 25),
  Person("Mani", 12),
  Person("Jack", 70),
  Person("Sue", 10))

fun isAdult(person: Person): Boolean {
  println("isAdult called for ${person.firstName}")
  return person.age > 17
}          

fun fetchFirstName(person: Person): String {
  println("fetchFirstName called for ${person.firstName}")
  return person.firstName
}          

val nameOfFirstAdult = people.asSequence()
  .filter(::isAdult)
  .map(::fetchFirstName)
  .first()

println(nameOfFirstAdult)

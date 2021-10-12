data class Person(val firstName: String, val age: Int)

val people = listOf(
  Person("Sara", 12),
  Person("Jill", 51),
  Person("Paula", 23),
  Person("Paul", 25),
  Person("Mani", 12),
  Person("Jack", 70),
  Person("Sue", 10))

val result = people.filter { person -> person.age > 20 }
  .map { person -> person.firstName }
  .map { name -> name.toUpperCase() }
  .reduce { names, name -> "$names, $name" }

println(result) //JILL, PAULA, PAUL, JACK

val result2 = people.filter { person -> person.age > 20 }
  .map { person -> person.firstName }
  .map { name -> name.toUpperCase() }
  .joinToString(", ")

println(result2) //JILL, PAULA, PAUL, JACK

val totalAge = people.map { person -> person.age }
  .reduce { total, age -> total + age }

println(totalAge) //203

val totalAge2 = people.map { person -> person.age }
  .sum()

println(totalAge2) //203

val nameOfFirstAdult = people.filter { person -> person.age > 17 }
  .map { person -> person.firstName }
  .first()

println(nameOfFirstAdult) //Jill

val families = listOf(
   listOf(Person("Jack", 40), Person("Jill", 40)),
   listOf(Person("Eve", 18), Person("Adam", 18)))
   
println(families.size) //2
println(families.flatten().size) //4

val namesAndReversed = people.map { person -> person.firstName }
  .map(String::toLowerCase)
  .map { name -> listOf(name, name.reversed())}

println(namesAndReversed.size) //7

val namesAndReversed2 = people.map { person -> person.firstName }
  .map(String::toLowerCase)
  .map { name -> listOf(name, name.reversed())}
  .flatten()

println(namesAndReversed2.size) //14  

val namesAndReversed3 = people.map { person -> person.firstName }
  .map(String::toLowerCase)  
  .flatMap { name -> listOf(name, name.reversed())}

println(namesAndReversed3.size) //14  

val namesSortedByAge = people.filter { person -> person.age > 17 }
  .sortedBy { person -> person.age }
  .map { person -> person.firstName }

println(namesSortedByAge) //[[Paula, Paul, Jill, Jack]

val namesSortedByAgeDesc = people.filter { person -> person.age > 17 }
  .sortedByDescending { person -> person.age }
    //[Jack, Jill, Paul, Paula]
  .map { person -> person.firstName }

println(namesSortedByAgeDesc) //[Jack, Jill, Paul, Paula]

val groupBy1stLetter = people.groupBy { person -> person.firstName.first() }

println(groupBy1stLetter)
//{S=[Person(firstName=Sara, age=12), Person(firstName=Sue, age=10)], J=[...  

val namesBy1stLetter = 
  people.groupBy({ person -> person.firstName.first() }) {
    person -> person.firstName
  }

println(namesBy1stLetter)
//{S=[Sara, Sue], J=[Jill, Jack], P=[Paula, Paul], M=[Mani]}

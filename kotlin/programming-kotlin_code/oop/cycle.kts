//ERROR
class Person(val first: String, val last: String) {
  var fulltime = true
  var location: String = "-"
  
  constructor(first: String, last: String, fte: Boolean): this(first, last, "--") {
    fulltime = fte
  }
  
  constructor(
    first: String, last: String, loc: String): this(first, last, false) {
    location = loc
  }
  
  override fun toString() = "$first $last $fulltime $location"
}

println(Person("Jane", "Doe"))         //Jane Doe true -
println(Person("John", "Doe", false))  //John Doe false -
println(Person("Baby", "Doe", "home")) //Baby Doe false home

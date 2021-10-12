fun canVote(name: String, age: Int): String {
  val status = if (age > 17) "yes, please vote" else "nope, please come back"
  
  return "$name, $status"
}

println(canVote("Eve", 12))

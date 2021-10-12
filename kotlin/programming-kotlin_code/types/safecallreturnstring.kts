fun nickName(name: String?): String {
  if (name == "William") {
    return "Bill"
  }

  val result = name?.reversed()?.toUpperCase()
  
  return if (result == null) "Joker" else result
}            

println("Nickname for William is ${nickName("William")}")
println("Nickname for Venkat is ${nickName("Venkat")}")
println("Nickname for null is ${nickName(null)}")

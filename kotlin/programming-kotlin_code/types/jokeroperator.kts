fun nickName(name: String?): String {
  if (name == "William") {
    return "Bill"
  }

   return name!!.reversed().toUpperCase() //BAD CODE
}            

println("Nickname for Venkat is ${nickName("Venkat")}")
println("Nickname for null is ${nickName(null)}")

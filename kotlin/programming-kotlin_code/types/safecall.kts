fun nickName(name: String?): String? {
  if (name == "William") {
    return "Bill"
  }

   return name?.reversed()
}            

println("Nickname for William is ${nickName("William")}")
println("Nickname for Venkat is ${nickName("Venkat")}")
println("Nickname for null is ${nickName(null)}")

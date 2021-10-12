fun greet(name: String): String {
  name = name.toUpperCase()
  return "Hello $name"
}

println(greet("Eve")) //Hello Eve
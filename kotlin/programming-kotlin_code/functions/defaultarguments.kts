fun greet(name: String, msg: String = "Hello"): String = "$msg $name"

println(greet("Eve")) //Hello Eve
println(greet("Eve", "Howdy")) //Howdy Eve
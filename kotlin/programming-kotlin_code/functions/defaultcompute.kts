fun greet(name: String, msg: String = "Hi ${name.length}") = "$msg $name"

println(greet("Scott", "Howdy")) //Howdy Scott
println(greet("Scott")) //Hi 5 Scott

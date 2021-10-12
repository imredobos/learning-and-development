import com.agiledeveloper.JavaClass

val javaObject = JavaClass()

println(javaObject.zero) // 0

println(javaObject.convertToUpper(listOf("Jack", "Jill"))) //[JACK, JILL]

javaObject.suspend() //suspending...

/*
println(javaObject.when()) //error: expecting an expression
*/

println(javaObject.`when`()) //Now!

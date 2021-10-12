val fruits: MutableList<String> = mutableListOf("Apple", "Banana", "Grape")
println(fruits::class) //class java.util.ArrayList

fruits.add("Orange")

println(fruits)
println(fruits::class)
println(fruits.javaClass)
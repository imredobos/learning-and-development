val array = arrayOf(1, 2, 3)

println(array.javaClass) //class [Ljava.lang.Integer;

for (e in array) { print("$e, ") } //1, 2, 3, 
println()


val list = listOf(1, 2, 3)

println(list.javaClass) //class java.util.Arrays$ArrayList

for (e in list) { print("$e, ") } //1, 2, 3, 
println()

val numbers = listOf(10, 12, 15, 17, 18, 19)

for (i in numbers) {
  if (i % 2 == 0) {
    print("$i, ") //10, 12, 18, 
  }
}

println()

numbers.filter { e -> e % 2 == 0 }
  .forEach { e -> print("$e, ") } //10, 12, 18,

println()

val doubled = mutableListOf<Int>()

for (i in numbers) {
  if (i % 2 == 0) {
    doubled.add(i * 2)
  }
}                    

println(doubled) //[20, 24, 36]

val doubledEven = numbers.filter { e -> e % 2 == 0 }
  .map { e -> e * 2 }
  
println(doubledEven) //[20, 24, 36]

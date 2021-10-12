run {
var doubleOfEven = mutableListOf<Int>()

for (i in 1..10) {
  if (i % 2 == 0) {
    doubleOfEven.add(i * 2)
  }
}

println(doubleOfEven) //[4, 8, 12, 16, 20]
}

run {
val doubleOfEven = (1..10)
  .filter { e -> e % 2 == 0}
  .map { e -> e * 2 }

println(doubleOfEven) //[4, 8, 12, 16, 20]
}

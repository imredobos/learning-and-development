import kotlin.system.*

fun process(n: Int) {
  Thread.sleep(1000)
  
  println(n)
}

val numbers = listOf(1, 2, 3, 4, 5, 6)

val time = measureTimeMillis {
  numbers.stream()
    .map { e -> e * 2 }
    .forEach(::process)
}

println("time taken: $time ms")

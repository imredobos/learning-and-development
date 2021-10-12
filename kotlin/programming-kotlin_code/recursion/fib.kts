import kotlin.system.measureTimeMillis
  
fun fib(n: Int) : Long = when (n) {
  0, 1 -> 1L
  else -> fib(n - 1) + fib(n - 2)  
}

println(measureTimeMillis { fib(40) }) //About 3 millisconds
println(measureTimeMillis { fib(45) }) //More than 4 seconds

println(fib(5))

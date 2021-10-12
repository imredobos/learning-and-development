import kotlin.system.*
import kotlinx.coroutines.*

suspend fun process(n: Int) {
  delay(1000)
  
  println(n)
}

val numbers = listOf(1, 2, 3, 4, 5, 6)

var time = measureTimeMillis {
  runBlocking {
    for (number in numbers) {
      process(number * 2)
    }
  }
}

println("time taken: $time ms")

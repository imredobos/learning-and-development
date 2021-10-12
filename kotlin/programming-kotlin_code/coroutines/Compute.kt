import kotlinx.coroutines.*

class Compute {
  fun compute1(n: Long): Long = n * 2
  suspend fun compute2(n: Long): Long {
    val factor = 2
    println("$n received : Thread: ${Thread.currentThread()}")
    delay(n * 1000)
    val result = n * factor
    println("$n, returning $result: Thread: ${Thread.currentThread()}")
    return result
  }
}

import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {
  val compute = Compute()
  
  launch(Dispatchers.Default) {
    compute.compute2(2)
  }
  launch(Dispatchers.Default) {
    compute.compute2(1)
  }
}
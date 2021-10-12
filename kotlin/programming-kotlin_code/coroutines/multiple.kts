import kotlinx.coroutines.*
import java.util.concurrent.Executors

//...task1 and task2 function definitions as before...

suspend fun task1() {
  println("start task1 in Thread ${Thread.currentThread()}")
  yield()
  println("end task1 in Thread ${Thread.currentThread()}")
}

suspend fun task2() {
  println("start task2 in Thread ${Thread.currentThread()}")
  yield()
  println("end task2 in Thread ${Thread.currentThread()}")
}

Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors())
  .asCoroutineDispatcher().use { context ->
  println("start")

  runBlocking {
    launch(context) { task1() }
    launch { task2() }

    println("called task1 and task2 from ${Thread.currentThread()}")
  }

  println("done")  
}

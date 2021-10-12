import kotlinx.coroutines.*

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

//...import, task1, and task2 functions like in previous code...

runBlocking(CoroutineName("top")) { 
  println("running in Thread ${Thread.currentThread()}")
  withContext(Dispatchers.Default) { task1() }
  
  launch(Dispatchers.Default + CoroutineName("task runner")) { task2() }
  
  println("running in Thread ${Thread.currentThread()}")
}

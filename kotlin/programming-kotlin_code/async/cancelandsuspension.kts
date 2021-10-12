import kotlinx.coroutines.*

suspend fun compute(checkActive: Boolean) = coroutineScope {
  var count = 0L
  val max = 10000000000

  while (if (checkActive) { isActive } else (count < max)) {
    count++
  }
  if (count == max) {
    println("compute, checkActive $checkActive ignored cancellation")
  } else {
    println("compute, checkActive $checkActive bailed out early")
  }
}

val url =  "http://httpstat.us/200?sleep=2000"

fun getResponse() = java.net.URL(url).readText()

suspend fun fetchResponse(callAsync: Boolean) = coroutineScope {
  try {
    val response = if (callAsync) {
      async { getResponse() }.await()
    } else {
      getResponse()
    }


    println(response)
  } catch(ex: CancellationException) {
    println("fetchResponse called with callAsync $callAsync: ${ex.message}")
  }
}

runBlocking {
  val job = launch(Dispatchers.Default) {
    launch { compute(checkActive = false) }
    launch { compute(checkActive = true) }
    launch { fetchResponse(callAsync = false) }
    launch { fetchResponse(callAsync = true) }
  }

  println("Let them run...")
  Thread.sleep(1000)
  println("OK, that's enough, cancel")
  job.cancelAndJoin()
}

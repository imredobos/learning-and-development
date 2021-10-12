import kotlinx.coroutines.*
import java.net.URL

suspend fun fetchResponse(code: Int, delay: Int) = coroutineScope {
  try {
    val response = async { 
      URL("http://httpstat.us/$code?sleep=$delay").readText()
    }.await() 
    
    println(response)
  } catch(ex: CancellationException) {
    println("${ex.message} for fetchResponse $code")
  }
}       

runBlocking {
  val handler = CoroutineExceptionHandler { _, ex ->
    println("Exception handled: ${ex.message}")
  }
  
  val job = launch(Dispatchers.IO + handler) {
    supervisorScope {
      launch { fetchResponse(200, 5000) }  
      launch { fetchResponse(202, 1000) }  
      launch { fetchResponse(404, 2000) }              
    }
  }
       
  Thread.sleep(4000)
  println("200 should still be running at this time")
  println("let the parent cancel now")
  job.cancel()
  job.join()
}

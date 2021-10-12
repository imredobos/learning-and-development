fun createRunnable(): Runnable = object: Runnable, AutoCloseable {
    override fun run() { println("You called...") }
    
    override fun close() { println("closing...") }
  }

val aRunnable = createRunnable()
aRunnable.run() //You called...
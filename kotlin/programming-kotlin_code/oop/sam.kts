fun createRunnable(): Runnable = Runnable { println("You called...") }

val aRunnable = createRunnable()
aRunnable.run() //You called...
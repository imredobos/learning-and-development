fun task1() {
  println("start task1 in Thread ${Thread.currentThread()}")
  println("end task1 in Thread ${Thread.currentThread()}")
}

fun task2() {
  println("start task2 in Thread ${Thread.currentThread()}")
  println("end task2 in Thread ${Thread.currentThread()}")
}

println("start")

run {
  task1()
  task2() 
  
  println("called task1 and task2 from ${Thread.currentThread()}")
}

println("done")

fun invokeWith(n: Int, action: (Int) -> Unit) {
  println("enter invokeWith $n")
  action(n)
  println("exit invokeWith $n")
}

fun caller() {
  (1..3).forEach { i ->
    invokeWith(i) here@ { 
      println("enter for $it")
      
      if (it == 2) {
        return@here 
      }
      
      println("exit for $it")
    }
  }

  println("end of caller")
} 

caller()
println("after return from caller")

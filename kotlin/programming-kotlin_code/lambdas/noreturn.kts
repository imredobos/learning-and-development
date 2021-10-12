fun invokeWith(n: Int, action: (Int) -> Unit) {
  println("enter invokeWith $n")
  action(n)
  println("exit invokeWith $n")
}

fun caller() { 
  (1..3).forEach { i -> 
    invokeWith(i) {
      println("enter for $it")
      
      if (it == 2) { return } //ERROR, return is not allowed here <label id="code.errorreturn" />
      
      println("exit for $it")
    }
  }

  println("end of caller")
} 

caller()
println("after return from caller")

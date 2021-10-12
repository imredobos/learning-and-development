inline fun invokeTwo(
  n: Int, 
  action1: (Int) -> Unit, 
  action2: (Int) -> Unit //ERROR
  ): (Int) -> Unit {
  
  println("enter invokeTwo $n")
  
  action1(n)
  
  println("exit invokeTwo $n")
  return { input: Int -> action2(input) }
}

fun callInvokeTwo() { 
  invokeTwo(1, { i ->
    if (i == 1) { return }
     
    report(i) 
  }, { i ->
    //if (i == 2) { return } //ERROR, return not allowed here
    
    report(i) 
  }) 
}

callInvokeTwo()

fun report(n: Int) {
  print("called with $n, ")
  
  println("Stack depth: ${RuntimeException().getStackTrace().size}")
}

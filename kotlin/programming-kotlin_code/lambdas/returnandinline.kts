inline fun invokeTwo(
  n: Int, 
  action1: (Int) -> Unit, 
  noinline action2: (Int) -> Unit
  ): (Int) -> Unit {
  
  println("enter invokeTwo $n")
  
  action1(n)
  action2(n)
  
  println("exit invokeTwo $n")
  return { _: Int -> println("lambda returned from invokeTwo") }
}

fun callInvokeTwo() { 
  invokeTwo(1, { i ->
    if (i == 1) { return }
     
    report(i) 
  }, { i ->
    //if (i == 2) { return }| //ERROR, return not allowed here <label id="code.notallowed" />
    report(i) 
  }) 
}

callInvokeTwo()

fun report(n: Int) {
  print("called with $n, ")
  
  println("Stack depth: ${RuntimeException().getStackTrace().size}")
}

import java.math.BigInteger

fun factorialRec(n: Int): BigInteger =
  if (n <= 0) 1.toBigInteger() else n.toBigInteger() * factorialRec(n - 1)
    
println(factorialRec(5)) //120

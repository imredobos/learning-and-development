import java.math.BigInteger

tailrec fun factorial(n: Int, 
  result: BigInteger = 1.toBigInteger()): BigInteger =
    if (n <= 0) result else factorial(n - 1, result * n.toBigInteger())

println(factorial(5)) //120

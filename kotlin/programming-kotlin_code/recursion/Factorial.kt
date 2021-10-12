import java.math.BigInteger

object Factorial {
  fun factorialRec(n: Int): BigInteger =
    if (n <= 0) 1.toBigInteger() else n.toBigInteger() * factorialRec(n - 1)

  tailrec fun factorial(n: Int, 
    result: BigInteger = 1.toBigInteger()): BigInteger =
      if (n <= 0) result else factorial(n - 1, result * n.toBigInteger())
}

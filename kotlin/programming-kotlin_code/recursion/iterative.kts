import java.math.BigInteger

fun factorialIterative(n: Int) =
  (1..n).fold(BigInteger("1")) { product, e -> product * e.toBigInteger() }
    
println(factorialIterative(5))
fun isPrime(n: Long) = n > 1 && (2..n - 1).none { i -> n % i == 0L }

val primes = sequence {
  var i: Long = 0
  
  while (true) {
    i++
    
    if (isPrime(i)) {
      yield(i)
    }
  }
}

println(primes.drop(2).take(6).toList()) //[5, 7, 11, 13, 17, 19]

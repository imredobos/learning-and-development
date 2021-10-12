fun isPrime(n: Long) = n > 1 && (2 until n).none { i -> n % i == 0L }

tailrec fun nextPrime(n: Long): Long =
  if (isPrime(n + 1)) n + 1 else nextPrime(n + 1)

val primes = generateSequence(5, ::nextPrime)
              
System.out.println(primes.take(6).toList()) //[5, 7, 11, 13, 17, 19]

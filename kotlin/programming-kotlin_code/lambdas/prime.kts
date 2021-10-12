run {
fun isPrime(n: Int) = n > 1 && (2 until n).none({ i: Int -> n % i == 0 })

(1..5). forEach { i -> println(isPrime(i))}
}

run {
fun isPrime(n: Int) = n > 1 && (2 until n).none({ i -> n % i == 0 })

(1..5). forEach { i -> println(isPrime(i))}
}

run {
fun isPrime(n: Int) = n > 1 && (2 until n).none { i -> n % i == 0 }

(1..5). forEach { i -> println(isPrime(i))}
}

run {
fun isPrime(n: Int) = n > 1 && (2 until n).none { n % it == 0 }

(1..5). forEach { i -> println(isPrime(i))}
}


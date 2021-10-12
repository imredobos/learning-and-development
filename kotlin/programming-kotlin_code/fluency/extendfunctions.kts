fun <T, R, U> ((T) -> R).andThen(next: (R) -> U): (T) -> U =
  { input: T -> next(this(input)) }

fun increment(number: Int): Double = number + 1.toDouble()
fun double(number: Double) = number * 2
                               
val incrementAndDouble = ::increment.andThen(::double)

println(incrementAndDouble(5)) //12.0

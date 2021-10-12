fun String.isPalindrome(): Boolean {
  return reversed() == this
}

fun String.shout() = toUpperCase()

val str = "dad"
println(str.isPalindrome()) //true
println(str.shout()) //DAD

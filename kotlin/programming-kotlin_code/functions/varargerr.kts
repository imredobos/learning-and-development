fun max(vararg numbers: Int): Int {
  var large = Int.MIN_VALUE
  
  for (number in numbers) {
    large = if (number > large) number else large
  }
  
  return large
}             

val values = intArrayOf(1, 21, 3)
println(max(values)) //ERROR
//type mismatch: inferred type is IntArray but Int was expected

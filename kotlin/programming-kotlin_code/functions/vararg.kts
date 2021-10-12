fun max(vararg numbers: Int): Int {
  var large = Int.MIN_VALUE
  
  for (number in numbers) {
    large = if (number > large) number else large
  }
  
  return large
}             
                        
println(max(1, 5, 2)) //5
println(max(1, 5, 2, 12, 7, 3)) //12

val values = intArrayOf(1, 21, 3)

println(max(values[0], values[1], values[2])) //SMELLY, don't


println(max(*values)) //21

println(max(*listOf(1, 4, 18, 12).toIntArray()))

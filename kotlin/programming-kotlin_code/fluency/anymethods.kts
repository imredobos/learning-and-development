val format = "%-10s%-10s%-10s%-10s"
val str = "context"
val result = "RESULT"

fun toString() = "lexical"

println(String.format("%-10s%-10s%-10s%-10s%-10s",
  "Method", "Argument", "Receiver", "Return", "Result"))
println("===============================================")

val result1 = str.let { arg ->                        
  print(String.format(format, "let", arg, this, result))
  result
}
println(String.format("%-10s", result1))

val result2 = str.also { arg ->                        
  print(String.format(format, "also", arg, this, result))
  result
}
println(String.format("%-10s", result2))

val result3 = str.run {
  print(String.format(format, "run", "N/A", this, result))
  result
}
println(String.format("%-10s", result3))

val result4 = str.apply {
  print(String.format(format, "apply", "N/A", this, result))
  result
}
println(String.format("%-10s", result4))

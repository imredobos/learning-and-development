fun <T: AutoCloseable> useAndClose(input: T) {
  input.close() //OK
}

val writer = java.io.StringWriter()
writer.append("hello ")
useAndClose(writer)
println(writer) // hello

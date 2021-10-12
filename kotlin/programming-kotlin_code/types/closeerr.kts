fun <T> useAndClose(input: T) {
  input.close() //ERROR: unresolved reference: close
}


val writer = java.io.StringWriter()
writer.append("hello ")
useAndClose(writer)
println(writer)

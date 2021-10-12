fun <T> useAndClose(input: T) 
  where T: AutoCloseable,
        T: Appendable {
  input.append("there")
  input.close()
}

val writer = java.io.StringWriter()
writer.append("hello ")
useAndClose(writer)
println(writer) //hello there

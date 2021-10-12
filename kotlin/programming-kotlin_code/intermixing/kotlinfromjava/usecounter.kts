import com.agiledeveloper.*

val counter = Counter(1)
println(counter + counter)

println(Counter.create())

println(counter.map { ctr -> ctr + ctr })
                                     
try {
  counter.readFile("blah")
} catch(ex: java.io.FileNotFoundException) {
  println("File not found")
}

println(counter.add(3))
println(counter.add())
                      
println(createCounter())

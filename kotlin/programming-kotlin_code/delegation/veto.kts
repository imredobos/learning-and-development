import kotlin.properties.Delegates.vetoable

var count by vetoable(0) { _, oldValue, newValue -> newValue > oldValue }
                                        
println("The value of count is: $count")

count++

println("The value of count is: $count")

count--

println("The value of count is: $count")
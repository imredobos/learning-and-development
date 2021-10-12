fun f1() = 2
fun f2() = { 2 }
fun f3(factor: Int) = { n: Int -> n * factor }

println(f1()) //2
println(f2()) //() -> kotlin.Int
println(f2()()) //2
println(f3(2)) //(kotlin.Int) -> kotlin.Int
println(f3(2)(3)) //6
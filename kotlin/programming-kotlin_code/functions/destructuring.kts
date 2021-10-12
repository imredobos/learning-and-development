fun getFullName() = Triple("John", "Quincy", "Adams")

run {
val result = getFullName()
val first = result.first
val middle = result.second
val last = result.third

println("$first $middle $last") //John Quincy Adams
}

run {
val (first, middle, last) = getFullName()

println("$first $middle $last")  //John Quincy Adams
}

run {
val (first, _, last) = getFullName()

println("$first $last")  //John Adams
}

run {
val (_, _, last) = getFullName()

println(last)  //Adams
}

run {
val (_, middle) = getFullName()

println(middle)  //Quincy
}
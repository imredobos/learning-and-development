class Counter(val value: Int) {
  operator fun inc() = Counter(value + 1)
  
  operator fun dec() = Counter(value - 1)
  
  override fun toString() = "$value"
}

var counter = Counter(2)
println(counter)    //2
println(++counter)  //3
println(counter)    //3
println(counter++)  //3
println(counter)    //4
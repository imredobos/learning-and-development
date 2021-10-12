fun printValues(values: Array<*>) {
  for (value in values) {
    println(value)
  }
  
  //values[0] = values[1] //ERROR
}

printValues(arrayOf(1, 2)) //1\n2

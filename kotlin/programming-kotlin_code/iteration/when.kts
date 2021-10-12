fun isAlive(alive: Boolean, numberOfLiveNeighbors: Int) = when {
    numberOfLiveNeighbors < 2 -> false
    numberOfLiveNeighbors > 3 -> false
    numberOfLiveNeighbors == 3 -> true
    else -> alive && numberOfLiveNeighbors == 2
  }

for (i in 1..4) {
  println(isAlive(true, i))  
}           

for (i in 1..4) {
  println(isAlive(false, i))  
}           

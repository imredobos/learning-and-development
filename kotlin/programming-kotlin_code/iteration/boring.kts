fun isAlive(alive: Boolean, numberOfLiveNeighbors: Int): Boolean {
  if (numberOfLiveNeighbors < 2) { return false }
  if (numberOfLiveNeighbors > 3) { return false }
  if (numberOfLiveNeighbors == 3) { return true }
  return alive && numberOfLiveNeighbors == 2
}

for (i in 1..4) {
  println(isAlive(true, i))  
}           

for (i in 1..4) {
  println(isAlive(false, i))  
}           

fun isAlive(alive: Boolean, numberOfLiveNeighbors: Int) =
  alive && numberOfLiveNeighbors == 2 || numberOfLiveNeighbors == 3

for (i in 1..4) {
  println(isAlive(true, i))  
}           

for (i in 1..4) {
  println(isAlive(false, i))  
}           

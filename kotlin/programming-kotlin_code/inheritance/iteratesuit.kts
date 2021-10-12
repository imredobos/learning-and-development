enum class Suit { CLUBS, DIAMONDS, HEARTS, SPADES }

val diamonds = Suit.valueOf("DIAMONDS")

println(diamonds)

try {
  val diamond = Suit.valueOf("DIAMOND")  
  println(diamond)
} catch(ex: Exception) {
  println(ex.message)
}

for (suit in Suit.values()) {
  println("${suit.name} -- ${suit.ordinal}") //CLUBS -- 0, etc.
}

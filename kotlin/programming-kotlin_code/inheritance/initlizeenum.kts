enum class Suit(val symbol: Char) { 
  CLUBS('\u2663'),
  DIAMONDS('\u2666'),
  HEARTS('\u2665') {
    override fun display() = "${super.display()} $symbol"
  },
  SPADES('\u2660');
  
  open fun display() = "$symbol $name"
}

for (suit in Suit.values()) {
  println(suit.display())
}

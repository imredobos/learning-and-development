enum class Suit { CLUBS, DIAMONDS, HEARTS, SPADES }

sealed class Card(val suit: Suit)

class Ace(suit: Suit) : Card(suit)

class King(suit: Suit) : Card(suit) {
  override fun toString() = "King of $suit"
}

//...

class Queen(suit: Suit) : Card(suit) {
  override fun toString() = "Queen of $suit"
}

class Jack(suit: Suit) : Card(suit) {
  override fun toString() = "Jack of $suit"
}

class Pip(suit: Suit, val number: Int) : Card(suit) {
  init {
    if (number < 2 || number > 10) {
      throw RuntimeException("Pip has to be between 2 and 10")
    }
  }
}

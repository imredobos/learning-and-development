operator fun ClosedRange<String>.iterator(): Iterator<String> = iterator {
  val next = StringBuilder(start)
  val last = endInclusive
  
  while (last >= next.toString() && last.length >= next.length) {
    val result = next.toString()
    
    val lastCharacter = next.last()
    
    if (lastCharacter < Char.MAX_VALUE) {
      next.setCharAt(next.length - 1, lastCharacter + 1)        
    } else {
      next.append(Char.MIN_VALUE)        
    }
    
    yield(result)
  }
}

for (word in "hell".."help") { print("$word, ") }

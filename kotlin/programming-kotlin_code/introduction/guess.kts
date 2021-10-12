fun accessGuess(guess: Int, pickedValue: Int) = when {
  guess == pickedValue -> "You got it!"
  guess < pickedValue -> "aim higher" 
  else -> "aim lower"
}

println(accessGuess(71, 71))
println(accessGuess(10, 71))
println(accessGuess(81, 71))
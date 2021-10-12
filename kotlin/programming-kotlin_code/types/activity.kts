fun whatToDo(dayOfWeek: Any) =  when (dayOfWeek) {
  "Saturday", "Sunday" -> "Relax"
  in listOf("Monday", "Tuesday", "Wednesday", "Thursday") -> "Work hard"
  in 2..4 -> "Work hard"
  "Friday" -> "Party"
  is String -> "What, you provided a string of length ${dayOfWeek.length}"
  else -> "No clue"
}

println(whatToDo("Sunday")) //Relax
println(whatToDo("Munday")) //What?

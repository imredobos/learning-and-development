fun whatToDo(dayOfWeek: Any) =  when (dayOfWeek) {
  is String -> "What?"
  "Saturday", "Sunday" -> "Relax"
  in listOf("Monday", "Tuesday", "Wednesday", "Thursday") -> "Work hard"
  in 2..4 -> "Work hard"
  "Friday" -> "Party"
  else -> "No clue"
}

println(whatToDo("Sunday")) //Relax
println(whatToDo("Wednesday")) //Work hard
println(whatToDo(3)) //Work hard
println(whatToDo("Friday")) //Party
println(whatToDo("Munday")) //What?
println(whatToDo(8)) //No clue

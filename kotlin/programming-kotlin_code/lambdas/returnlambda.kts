val names = listOf("Pam", "Pat", "Paul", "Paula")

println(names.find {name -> name.length == 5 }) //Paula

println(names.find { name -> name.length == 4 }) //Paul

fun predicateOfLength(length: Int): (String) -> Boolean {
  return { input: String -> input.length == length }
}

println(names.find(predicateOfLength(5))) //Paula

println(names.find(predicateOfLength(4))) //Paul

run {
fun predicateOfLength(length: Int) =
  { input: String -> input.length == length }

println(names.find(predicateOfLength(5))) //Paula

println(names.find(predicateOfLength(4))) //Paul
}

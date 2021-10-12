fun fetchMessage(id: Int): Any =
  if (id == 1) "Record found" else StringBuilder("data not found")

run {
val message: String = fetchMessage(1) as String

println(message)  
}

run {
val message: String? = fetchMessage(1) as? String

println(message)  
}


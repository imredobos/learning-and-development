fun sort(numbers: List<Int>): List<Int> =
  if (numbers.isEmpty())
    numbers
  else {
    val pivot = numbers.first()
    val tail = numbers.drop(1)
    val lessOrEqual = tail.filter { e -> e <= pivot }
    val larger = tail.filter { e -> e > pivot }

    sort(lessOrEqual) + pivot + sort(larger)
  }

println(sort(listOf(12, 5, 15, 12, 8, 19))) //[5, 8, 12, 12, 15, 19]

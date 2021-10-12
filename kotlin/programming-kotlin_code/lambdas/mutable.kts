var factor = 2

val doubled = listOf(1, 2).map { it * factor }
val doubledAlso = sequenceOf(1, 2).map { it * factor }

factor = 0

doubled.forEach { println(it) }
doubledAlso.forEach { println(it) }
open class Fruit
class Banana : Fruit()
class Orange: Fruit()

fun receiveFruits(fruits: Array<Fruit>) {
  println("Number of fruits: ${fruits.size}")
}

val bananas: Array<Banana> = arrayOf() 
receiveFruits(bananas) //ERROR: type mismatch

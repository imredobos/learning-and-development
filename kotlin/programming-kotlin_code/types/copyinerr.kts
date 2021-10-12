open class Fruit
class Banana : Fruit()
class Orange: Fruit()

fun copyFromTo(from: Array<out Fruit>, to: Array<Fruit>) {
  for (i in 0 until from.size) {
    to[i] = from[i]
  }
}

val things = Array<Any>(3) { _ -> Fruit() }
val bananaBasket = Array<Banana>(3) { _ -> Banana() }
                                             
copyFromTo(bananaBasket, things) //ERROR: type mismatch

println(bananaBasket[0] == things[0])

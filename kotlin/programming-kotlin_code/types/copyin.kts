open class Fruit
class Banana : Fruit()
class Orange: Fruit()

fun copyFromTo(from: Array<out Fruit>, to: Array<in Fruit>) {
  for (i in 0 until from.size) {
    to[i] = from[i]
  }
}

val things = Array<Any>(3) { _ -> Fruit() }
val bananaBasket = Array<Banana>(3) { _ -> Banana() }
                                             
copyFromTo(bananaBasket, things) //OK

println(bananaBasket[0] == things[0])

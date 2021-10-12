open class Fruit
class Banana : Fruit()
class Orange: Fruit()

fun copyFromTo(from: Array<out Fruit>, to: Array<Fruit>) {
  
  for (i in 0 until from.size) {
    from[i] = Fruit()  //ERROR
    from.set(i, to[i]) //ERROR
    to[i] = from[i]
  }
}

val fruitsBasket = Array<Fruit>(3) { _ -> Fruit() }
val bananaBasket = Array<Banana>(3) { _ -> Banana() }
                                             
copyFromTo(bananaBasket, fruitsBasket) //OK

println(bananaBasket[0] == fruitsBasket[0])

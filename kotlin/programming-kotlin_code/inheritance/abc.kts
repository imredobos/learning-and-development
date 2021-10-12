abstract class Musician(val name: String, val activeFrom: Int) {
  abstract fun instrumentType(): String
}

class Cellist(name: String, activeFrom: Int) : Musician(name, activeFrom) {
  override fun instrumentType() = "String"
}

val ma = Cellist("Yo-Yo Ma", 1961)

println(ma.name)

object Util {
  fun numberOfProcessors() = Runtime.getRuntime().availableProcessors()
}

println(Util.numberOfProcessors()) //8

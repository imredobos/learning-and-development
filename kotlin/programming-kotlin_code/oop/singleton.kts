object Sun : Runnable {
  val radiusInKM = 696000
  var coreTemperatureInC = 15000000
  
  override fun run() { println("spin...") }
}

fun moveIt(runnable: Runnable) {
  runnable.run()
}               

println(Sun.radiusInKM) //696000

moveIt(Sun)  //spin...
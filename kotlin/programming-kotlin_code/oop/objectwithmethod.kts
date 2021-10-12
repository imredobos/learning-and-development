fun drawCircle() {
  val circle = object {
    val x = 10
    val y = 20
    var radius = 30
    
    fun makeBigger() {
      radius++
    }
  }            

  //Pass circle.x, circle.y, circle.radius to a draw function here
    
  circle.makeBigger()                
    
  println("Circle x: ${circle.x} y: ${circle.y} radius: ${circle.radius}")
  //Circle x: 10 y: 20 radius: 30  
}

drawCircle()
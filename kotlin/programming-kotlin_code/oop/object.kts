fun drawCircle() {
  val circle = object { //an expression
    val x = 10
    val y = 20
    val radius = 30
  }            

  //Pass circle.x, circle.y, circle.radius to a draw function here
    
  println("Circle x: ${circle.x} y: ${circle.y} radius: ${circle.radius}")
  //Circle x: 10 y: 20 radius: 30  
}

drawCircle()
import kotlinx.interop.wasm.dom.*

fun main() {
  val canvas = document.getElementById("display").asCanvas

  val context = canvas.getContext("2d")
  
  val rect = canvas.getBoundingClientRect()
  val offsetX = (rect.right - rect.left) / 4
  val offsetY = (rect.bottom - rect.top) / 4

  context.apply {
    fillStyle = "green"
    strokeStyle = "white"
    lineWidth = 10
    
    fillRect(rect.left, rect.top, rect.right, rect.bottom)
    beginPath()        
    moveTo(rect.left + offsetX / 2, rect.bottom - 3 * offsetY)
    lineTo(rect.left + offsetX, rect.bottom - 2 * offsetY)
    lineTo(rect.right - offsetX, rect.top + offsetY)
    stroke()
  }
}

class Meeting(val title: String) {
  var startTime: String = ""
  var endTime: String = ""
  
  private fun convertToString(time: Double) = String.format("%.02f", time)
  fun at(time: Double) { startTime = convertToString(time) }
  fun by(time: Double) { endTime = convertToString(time) }
  
  override fun toString() = "$title Meeting starts $startTime ends $endTime"
}

infix fun String.meeting(block: Meeting.() -> Unit) {
  val meeting = Meeting(this)
  
  meeting.block()
  
  println(meeting)
}

"Release Planning" meeting  {
  at(14.30)
  by(15.20)
}


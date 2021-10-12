class Meeting(val title: String) {
  var startTime: String = ""
  var endTime: String = ""
  val start = this
  val end = this
  
  private fun convertToString(time: Double) = String.format("%.02f", time)
  infix fun at(time: Double) { startTime = convertToString(time) }
  infix fun by(time: Double) { endTime = convertToString(time) }
  
  override fun toString() = "$title Meeting starts $startTime ends $endTime"
}

infix fun String.meeting(block: Meeting.() -> Unit) {
  val meeting = Meeting(this)
  
  meeting.block()
  
  println(meeting)
}

"Release Planning" meeting  {
  start at 14.30
  end by 15.20
}

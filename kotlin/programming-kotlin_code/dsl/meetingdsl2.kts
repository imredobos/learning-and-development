class Meeting

infix fun String.meeting(block: Meeting.() -> Unit) {
  val meeting = Meeting()
  
  meeting.block()
  
  println(meeting)
}

"Release Planning" meeting  {
  println("With in lambda: $this")
}


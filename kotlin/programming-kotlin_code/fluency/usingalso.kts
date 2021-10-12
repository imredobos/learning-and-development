class Mailer {
  val details = StringBuilder()
  fun from(addr: String) = details.append("from $addr...\n")
  fun to(addr: String) = details.append("to $addr...\n")
  fun subject(line: String) = details.append("subject $line...\n")
  fun body(message: String) = details.append("body $message...\n")
  fun send() = "...sending...\n$details"
}

fun createMailer() = Mailer()

fun prepareMailer(mailer: Mailer):Unit {
  mailer.run {
    from("builder@agiledeveloper.com")
    to("venkats@agiledeveloper.com")
    subject("Your code suks")
    body("details")
  }
}

fun sendMail(mailer: Mailer): Unit {
  mailer.send()
  println("Mail sent")
}

val mailer = createMailer()
prepareMailer(mailer)
sendMail(mailer)

createMailer()
  .also(::prepareMailer)
  .also(::sendMail)

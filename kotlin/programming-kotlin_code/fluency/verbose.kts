class Mailer {
  val details = StringBuilder()
  fun from(addr: String) = details.append("from $addr...\n")
  fun to(addr: String) = details.append("to $addr...\n")
  fun subject(line: String) = details.append("subject $line...\n")
  fun body(message: String) = details.append("body $message...\n")
  fun send() = "...sending...\n$details"
}

val mailer = Mailer()
mailer.from("builder@agiledeveloper.com")
mailer.to("venkats@agiledeveloper.com")
mailer.subject("Your code sucks")
mailer.body("...details...")
val result = mailer.send()
println(result)

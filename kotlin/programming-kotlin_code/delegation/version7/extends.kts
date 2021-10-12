interface Worker {
  fun work()
  fun takeVacation()
  fun fileTimeSheet() = println("Why? Really?")
}

class JavaProgrammer : Worker {
  override fun work() = println("...write Java...")
  override fun takeVacation() = println("...code at the beach...")
}

open class Boss() {
  fun takeVacation() = println("like a boss")
}

class Manager(val staff: Worker) : Worker by staff, Boss()

val doe = Manager(JavaProgrammer())
doe.takeVacation()


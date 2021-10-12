interface Worker {
  fun work()
  fun takeVacation()
}

class JavaProgrammer : Worker {
  override fun work() = println("...write Java...")
  override fun takeVacation() = println("...code at the beach...")
}

class CSharpProgrammer : Worker {
  override fun work() = println("...write C#...")
  override fun takeVacation() = println("...branch at the ranch...")
}

class Manager(val staff: Worker) : Worker by staff {
  override fun takeVacation() = println("of course")
}

val doe = Manager(CSharpProgrammer())
doe.work()         //...write C#...
doe.takeVacation() //of course

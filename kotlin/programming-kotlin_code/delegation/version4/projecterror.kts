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

class Manager() : Worker by JavaProgrammer()

val doe = Manager()
doe.work() //...write Java...

val coder: JavaProgrammer = doe //ERROR: type mismatch

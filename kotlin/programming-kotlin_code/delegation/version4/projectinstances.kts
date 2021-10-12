interface Worker {
  fun work()
  fun takeVacation()
}

class JavaProgrammer : Worker {
  override fun work() = println("...write Java..." + this)
  override fun takeVacation() = println("...code at the beach...")
}

class CSharpProgrammer : Worker {
  override fun work() = println("...write C#...")
  override fun takeVacation() = println("...branch at the ranch...")
}

class Manager() : Worker by JavaProgrammer()

val doe1 = Manager()
doe1.work() //...write Java...

val doe2 = Manager()
doe2.work() //...write Java...

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

class Manager(val worker: Worker) {
 fun work() = worker.work()
 
 fun takeVacation() = worker.work() //yeah, right, like that's gonna happen
}

val doe = Manager(JavaProgrammer())
doe.work() //...write Java...

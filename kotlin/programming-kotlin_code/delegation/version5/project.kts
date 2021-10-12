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
  fun meeting() =
    println("organizing meeting with ${staff.javaClass.simpleName}")
}

val doe = Manager(CSharpProgrammer())
val roe = Manager(JavaProgrammer())

doe.work() //...write C#...
doe.meeting()//organizing meeting with CSharpProgrammer

roe.work() //...write Java...
roe.meeting()//organizing meeting with JavaProgrammer

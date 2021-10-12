interface Worker {
  fun work()
  fun takeVacation()
  fun fileTimeSheet() = println("Why? Really?")
}

class JavaProgrammer : Worker {
  override fun work() = println("...write Java...")
  override fun takeVacation() = println("...code at the beach...")
}

class CSharpProgrammer : Worker {
  override fun work() = println("...write C#...")
  override fun takeVacation() = println("...branch at the ranch...")
}
                        
class Manager(var staff: Worker) : Worker by staff

val doe = Manager(JavaProgrammer())

println("Staff is ${doe.staff.javaClass.simpleName}")
doe.work()

println("changing staff")
doe.staff = CSharpProgrammer()
println("Staff is ${doe.staff.javaClass.simpleName}")
doe.work()

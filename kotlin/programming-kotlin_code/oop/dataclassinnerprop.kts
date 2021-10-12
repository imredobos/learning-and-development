data class Task(val id: Int, val name: String, val completed: Boolean, val assigned: Boolean) {
  val reviewed: Boolean = true
  
  constructor() : this(1, "sample", false, true)
}

val task1 = Task(1, "Create Project", false, true)
println(task1)

val task2 = Task()
println(task2)

val task3 = task2.copy()
println(task3.reviewed)
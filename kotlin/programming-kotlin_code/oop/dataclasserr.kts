data class Task(val id: Int, val name: String, assigned: Boolean)

val task1 = Task(1, "Create Project", false) //ERROR
println(task1)
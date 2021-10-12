data class Task(val id: Int, val name: String, 
  val completed: Boolean, val assigned: Boolean)

val task1 = Task(1, "Create Project", false, true)
println(task1)
  //Task(id=1, name=Create Project, completed=false, assigned=true)
println("Name: ${task1.name}") //Name: Create Project

val task1Completed = task1.copy(completed = true, assigned = false)
println(task1Completed)
  //Task(id=1, name=Create Project, completed=true, assigned=false)

println("ID is ${task1.id}, yes it is ${task1.component1()}")
 //ID is 1, yes it is 1

run {
val id = task1.id
val isAssigned = task1.assigned
println("Id: $id Assigned: $isAssigned") //Id: 1 Assigned: true
}

val (id, _, _, isAssigned) = task1
println("Id: $id Assigned: $isAssigned") //Id: 1 Assigned: true

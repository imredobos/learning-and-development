class MachineOperator(val name: String) {
  fun checkin() = checkedIn++
  fun checkout() = checkedIn--
  
  companion object {
    var checkedIn = 0
    
    fun minimumBreak() = "15 minutes every 2 hours"
  }
}

MachineOperator("Mater").checkin()

println(MachineOperator.minimumBreak()) //15 minutes every 2 hours

println(MachineOperator.checkedIn) //1

val ref = MachineOperator.Companion

println(ref)

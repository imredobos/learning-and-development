class MachineOperator(val name: String) {
  fun checkin() = checkedIn++
  fun checkout() = checkedIn--
  
  companion object {
    var checkedIn = 0
    
    fun minimumBreak() = "15 minutes every 2 hours"
  }
}

MachineOperator("Mater").minimumBreak() //ERROR

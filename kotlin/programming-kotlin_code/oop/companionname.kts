class MachineOperator {
  fun checkin() = checkedIn++
  fun checkout() = checkedIn--

  //companion object {
  companion object MachineOperatorFactory {
    var checkedIn = 0
    //...
    
    fun minimumBreak() = "15 minutes every 2 hours"
  }
}

val ref = MachineOperator.MachineOperatorFactory

println(ref)

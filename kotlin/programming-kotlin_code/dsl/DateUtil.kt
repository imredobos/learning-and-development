package datedsl

import java.util.Calendar
import datedsl.DateUtil.Tense.*

infix fun Int.days(timing: DateUtil.Tense) = DateUtil(this, timing)

class DateUtil(val number: Int, val tense: Tense) {
  enum class Tense {
    ago, from_now
  }
  
  override fun toString(): String {
    val today = Calendar.getInstance()
    
    when (tense) {
      ago -> today.add(Calendar.DAY_OF_MONTH, -number)
      from_now -> today.add(Calendar.DAY_OF_MONTH, number)
    }
    
    return today.getTime().toString()
  }
}

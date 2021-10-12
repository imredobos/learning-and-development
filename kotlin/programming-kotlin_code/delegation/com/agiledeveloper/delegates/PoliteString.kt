package com.agiledeveloper.delegates

import kotlin.reflect.KProperty

class PoliteString(var content: String) {
  operator fun getValue(thisRef: Any?, property: KProperty<*>) = 
    content.replace("stupid", "s*****")
  
  operator fun setValue(thisRef: Any, property: KProperty<*>, value: String) {
    content = value
  }
}
                                                        
//This function goes at the end of class PoliteString
fun beingpolite(content: String) = PoliteString(content)

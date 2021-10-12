package com.agiledeveloper.joint

import kotlin.jvm.JvmStatic

object App { 
  @JvmStatic
  fun main(@Suppress("UNUSED_PARAMETER") args: Array<String>) {
    println("Running App...")
    
    println(Util().f2c(50.0))
  }
}

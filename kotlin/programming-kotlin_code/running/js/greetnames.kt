package com.agiledeveloper.jsexample

fun greetNames(names: List<String>) = "hello ${names.joinToString(", ")}"

fun main() {
  println(greetNames(listOf("Jack", "Jill")))
}

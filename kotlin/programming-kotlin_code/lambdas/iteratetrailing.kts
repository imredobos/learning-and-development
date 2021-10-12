fun walk1To(n: Int, action: (Int) -> Unit) = (1..n).forEach { action(it) }

walk1To(5, { i -> print(i) })

walk1To(5) { i -> print(i) }

walk1To(5) {i -> 
  print(i) 
}

walk1To(5) { print(it) }

fun walk1To(action: (Int) -> Unit, n: Int) =
  (1..n).forEach { action(it) }

walk1To({ i -> print(i) }, 5) //12345

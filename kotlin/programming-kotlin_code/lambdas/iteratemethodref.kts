fun walk1To(n: Int, action: (Int) -> Unit) = (1..n).forEach(action)

walk1To(5) { i -> print(i) }
walk1To(5, ::print)

walk1To(5) { i -> System.out.println(i) }

walk1To(5, System.out::println)


fun send(n: Int) = println(n)
      
walk1To(5) { i -> send(i) }
walk1To(5, this::send)

object Terminal {
  fun write(value: Int) = println(value)
}

walk1To(5) { i -> Terminal.write(i) }
walk1To(5, Terminal::write)

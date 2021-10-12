abstract class Book(val name: String)
class Fiction(name: String) : Book(name)
class NonFiction(name: String) : Book(name)

val books: List<Book> = listOf(
  Fiction("Moby Dick"), NonFiction("Learn to Code"), Fiction("LOTR"))

fun <T> findFirst(books: List<Book>, ofClass: Class<T>): T {
  val selected = books.filter { book -> ofClass.isInstance(book) }
  
  if(selected.size == 0) {
    throw RuntimeException("Not found")
  }
  
  return ofClass.cast(selected[0])
}
                                            
println(findFirst(books, NonFiction::class.java).name) //Learn to Code

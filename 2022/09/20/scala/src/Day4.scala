/**
 * Basic Scala code for the fourth day of exploration
 *
 * Date: 9/20/2022
 * @author Andrew Jarombek
 */

object Day4 {
  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3)

    // Try..catch in Scala using case statements
    try {
      list.apply(5)
    } catch {
      case outOfBoundsException: IndexOutOfBoundsException => println(s"index out of bounds $outOfBoundsException")
      case throwable: Throwable => println(s"unexpected error $throwable")
    }

    // Create a list using Lisp-like syntax.  This reminds me of creating lists in other functional programming
    // languages like Haskell.
    val list2 = 1 :: 2 :: 3 :: Nil

    assert(list.equals(list2))
    assert(!list.eq(list2))

    // Scala for loop over items in a list
    for (item <- list2) {
      println(item)
    }

    // For loop over a range of integers.  Will print out 1 2 3.
    for (i <- 1 to 3) {
      println(i)
    }

    // For loop over a range of integers by a certain increment.  Will print out 1 3.
    for (i <- 1 to 3 by 2) {
      println(i)
    }

    // Prints 2 4 6
    val double = for (i <- 1 to 3) yield i * 2
    double.foreach(i => println(i))
  }

  val walks = 1.95 :: 1.8 :: 1.89 :: 0.83 :: 1.27 :: 1.52 :: 1.47 :: 1.96 :: Nil

  // Feels syntactically similar to a list comprehension in Python.
  val longWalks = for {
    walk <- walks
    if walk >= 1.5
  } yield walk

  assert(longWalks.length == 5)

  // Not a very good trait/class implementation, but just starting to learn it.
  val aapl = new Stock("AAPL", "Apple")
  assert(aapl.company == "Apple")
  assert(aapl.symbol == "AAPL")
}
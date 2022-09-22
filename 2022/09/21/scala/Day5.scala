/**
 * Basic Scala code for the fifth day of exploration
 *
 * Date: 9/21/2022
 * @author Andrew Jarombek
 */

object Day5 {
  def main(args: Array[String]): Unit = {
    // Explore different ways to initialize a list in Scala
    // List from 0 to 9 (inclusive)
    var nums = (0 to 9).toList
    assert(nums.length == 10)

    // List from 0 to 4 (inclusive)
    nums = List.range(0, 5)
    assert(nums.length == 5)

    nums.foreach(println)

    val largerNums = nums.filter(_ > 2)
    assert(largerNums.length == 2)
    assert(largerNums.head == 3)
    assert(largerNums.apply(1) == 4)

    // Similar to fold functionality in Haskell
    var sum = nums.fold(0)((x, y) => x + y)
    assert(sum == 10)

    sum = nums.sum
    assert(sum == 10)

    // Shorthand for the fold command above
    sum = nums.fold(0)(_ + _)
    assert(sum == 10)

    // Sum of even numbers using fold
    val evenSum = nums.fold(0)((x, y) => if (y % 2 == 0) x + y else x)
    assert(evenSum == 6)

    val numsx2 = nums.map(_ * 2)
    assert(numsx2.sum == 20)

    // Tuples in Scala
    val walk = ("9/20/2022", 3.12, 58, 53)

    assert(walk._1 == "9/20/2022")
    assert(walk._2 == 3.12)
    assert(walk._3 == 58)
    assert(walk._4 == 53)

    def todaysWalk(): (String, Int, Int, Int) =
      ("9/21/2022", 3, 55, 0)

    // Extract values using pattern matching (called value destructuring in other languages)
    val (date, miles, minutes, seconds) = todaysWalk()

    assert(date == "9/21/2022")
    assert(miles == 3)
    assert(minutes == 55)
    assert(seconds == 0)
  }
}
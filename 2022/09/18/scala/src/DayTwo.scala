/**
 * Basic Scala code for the second day of exploration
 *
 * Date: 9/18/2022
 * @author Andrew Jarombek
 */

object DayTwo {
  def apiRequest(onComplete: String => Unit): Unit = {
    // Mock API request
    // In Scala, val makes a variable immutable, while var makes a variable mutable.
    val result = "{\"response\": \"true\"}"
    onComplete(result)
  }

  def main(args: Array[String]): Unit = {
    def printResult(result: String): Unit =
      println(s"API Result Body: $result")

    apiRequest(printResult)

    val walk = new Exercise("walk", "Sep 17th, 2022", 0.8)
    println(walk)
    println(walk.miles)

    // Parentheses for method calls can be excluded if there are no arguments
    println(walk.toString())
    println(walk.toString)

    // Fields in a case class are immutable
    case class Run(date: String, time: String, miles: Double)
    val runAttempt = Run("Sep 16th, 2022", "00:04:30", 0.5)
    println(runAttempt)

    // The following is a compile-time error
    // runAttempt.miles = 1
  }
}
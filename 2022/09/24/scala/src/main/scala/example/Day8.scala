package example

/**
 * Basic Scala code for the eighth day of exploration.
 *
 * Date: 9/24/2022
 *
 * @author Andrew Jarombek
 */

object Day8 {
  def title: String =
    "day 8"

  def main(args: Array[String]): Unit = {
    println(title)

    // Scala multi-line strings.  With 'stripMargin', multi-line strings exclude any
    // padding visible in the code.
    val summary =
      """
        |It was a bit cool out today, so I didn't kayak
        |for long in the morning.  Maybe tomorrow!
        |""".stripMargin

    println(summary)
  }
}

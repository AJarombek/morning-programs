package example

import org.scalatest.funsuite._

/**
 * Basic Scala test code for the ninth day of exploration.
 *
 * Date: 9/25/2022
 *
 * @author Andrew Jarombek
 */

class Day9Spec extends AnyFunSuite {
  test("title is day 9") {
    assert(Day9.title == "day 9")
  }

  test("yield examples") {
    val languages = List(
      "JavaScript Programming",
      "Java Programming",
      "Python Programming",
      "Go Programming",
      "C Programming"
    )

    val names = for (lang <- languages) yield {
      val name = lang.split(" ").head
      name.toLowerCase
    }

    assert(names.head == "javascript")
  }

  test("match expressions") {
    assert(Day9.day(0) == "monday")
    assert(Day9.day(10) == "thursday")
    assert(Day9.day(20) == "monday")
    assert(Day9.day(30) == "wednesday")

    assert(Day9.exerciseType("run") == "run")
    assert(Day9.exerciseType("core") == "fitness")
    assert(Day9.exerciseType("bike") == "cross train")
    assert(Day9.exerciseType("kayak") == "summer activities")
    assert(Day9.exerciseType("cross country skiing") == "winter activities")
    assert(Day9.exerciseType("elliptical") == "unknown")

    assert(Day9.runType(2) == "shakeout")
    assert(Day9.runType(5) == "regular run")
    assert(Day9.runType(13.1) == "long run")
    assert(Day9.runType(-2) == "invalid mileage")
  }
}

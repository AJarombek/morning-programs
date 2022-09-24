package example

import org.scalatest.funsuite._

/**
 * Basic Scala test code for the seventh day of exploration.
 *
 * Date: 9/23/2022
 *
 * @author Andrew Jarombek
 */

class Day7Spec extends AnyFunSuite {
  test("title is day 7") {
    assert(Day7.title == "day 7")
  }

  test("dataframe count") {
    assert(Day7.createDF.count() == 14)
  }
}

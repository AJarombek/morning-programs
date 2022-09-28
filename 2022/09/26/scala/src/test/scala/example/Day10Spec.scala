package example

import org.scalatest.funsuite._

/**
 * Basic Scala test code for the tenth day of exploration.
 *
 * Date: 9/26/2022
 *
 * @author Andrew Jarombek
 */

class Day10Spec extends AnyFunSuite {
  test("title is day 10") {
    assert(Day10.title == "day 10")
  }

  test("stuffed animals") {
    val dotty = new StuffedAnimal("Dotty", "Horse")
    assert(dotty.name == "Dotty")

    val lily = new StuffedAnimal("Lily", "Bear")
    assert(lily.species == "Bear")

    val dotty2 = new StuffedAnimal("Dotty", "Horse")

    assert(dotty !== lily)
    assert(dotty === dotty2)

    assert(dotty !== "Dotty")
  }
}

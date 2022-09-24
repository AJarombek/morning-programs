package example

import org.scalatest.funsuite._

/**
 * Basic Scala test code for the eighth day of exploration.
 *
 * Date: 9/24/2022
 *
 * @author Andrew Jarombek
 */

class Day8Spec extends AnyFunSuite {
  test("title is day 8") {
    assert(Day8.title == "day 8")
  }

  // Exploring built-in types.  Scala has built-in types for Java's primitive types.
  // The difference is Scala's built-in types are objects, while Java's primitives are not.
  test("built-in types") {
    // Arithmetic on bytes/shorts does not seem straightforward
    var byte: Byte = 127
    byte = byte.+(1).toByte
    assert(byte == -128)

    var short: Short = 32_767
    short = short.+(1).toShort
    assert(short == -32_768)

    // Meanwhile, for Int it is easy
    var i: Int = 2_147_483_647
    i += 1
    assert(i == -2_147_483_648)

    i = 2_147_483_647
    val j: Long = i.toLong.+(1)
    assert(j == 2_147_483_648L)

    var c: Char = 'a'
    c = c.+(1).toChar
    assert(c == 'b')
  }

  test("maps") {
    // Map of some JVM languages
    val map = Map(
      "Java" -> 1995,
      "Groovy" -> 2003,
      "Scala" -> 2004,
      "Clojure" -> 2007,
      "Kotlin" -> 2011
    )

    assert(map.size == 5)
    assert(map.apply("Scala") == 2004)

    for ((name, yearCreated) <- map) {
      println(s"$name created in $yearCreated")
    }

    // Create a list of language names based on the language map
    val languages = for ((name, _) <- map) yield name
    println(languages)
    assert(languages.size == 5)
  }
}

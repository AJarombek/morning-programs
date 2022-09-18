/**
 * Basic Scala code for initial exploration
 *
 * Date: 9/17/2022
 * @author Andrew Jarombek
 */

import java.util
import scala.collection.mutable
import scala.collection.immutable.HashSet

// An object in Scala is a singleton object.  Members of the object are effectively "static",
// although not static keyword exists in Scala.
object Basics {
  def main(args: Array[String]): Unit = {
    // Everything in Scala is an object, even Java's primitive types like integers.
    // Therefore, addition can be written as a method call.
    val two = 1 + 1
    val twoAgain = 1.+(1)
    println(s"$two = $twoAgain")

    val four = twoAgain.*(2)
    println(s"$four = $two * 2")

    // All Java libraries work in Scala
    val map = new util.HashMap[String,Integer]()
    map.put("Andy", 27)

    val set = new util.HashSet[String]()
    set.add("Walk")
    set.add("Core")
    set.add("Strength")
    set.add("PT")

    println(s"Core is in set: ${set.contains("Core")}")
    println(s"Run is in set: ${set.contains("Run")}")

    // Scala has equivalents for data structures like hash maps and hash sets.
    // This is similar to other JVM languages like Groovy.
    val scalaSet = new mutable.HashSet[String]()
    scalaSet.add("Kayak")
    scalaSet.add("Bike")

    // There is also an immutable equivalent to mutable.HashSet
    val scalaImmutableSet = HashSet[String]("Swim", "Hike")
    scalaImmutableSet.foreach(item => println(item))

    // Unit is similar to "void" in Java
    def printName(name: String): Unit =
      println(s"My name is $name.")

    printName("Andy Jarombek")

    // I really don't know anything about you anymore.  That fact makes me very
    // sad, but I also know it wouldn't be that way if you didn't make it so.
    // I hope you made this choice because you are happier without me and not
    // because of something else that has gone wrong.
  }
}

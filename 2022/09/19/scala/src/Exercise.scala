/**
 * Case classes for exercises
 *
 * Date: 9/19/2022
 * @author Andrew Jarombek
 */

abstract class Exercise
object Exercise {
  case class Run(date: String, duration: String, miles: Double) extends Exercise
  case class Strength(date: String, duration: String, targeting: String) extends Exercise
}

package example

/**
 * Basic Scala code for the ninth day of exploration.
 *
 * Date: 9/25/2022
 *
 * @author Andrew Jarombek
 */

object Day9 {
  def title: String =
    "day 9"

  def main(args: Array[String]): Unit = {
    println(title)
  }

  def day(sinceMonday: Int): String =
    sinceMonday % 7 match {
      case 0 => "monday"
      case 1 => "tuesday"
      case 2 => "wednesday"
      case 3 => "thursday"
      case 4 => "friday"
      case 5 => "monday"
      case 6 => "monday"
    }

  def exerciseType(exercise: String): String =
    exercise match {
      case "run" => "run"
      case "strength" | "core" | "yoga" => "fitness"
      case "bike" | "swim" => "cross train"
      case "kayak" => "summer activities"
      case "alpine skiing" | "cross country skiing" | "backcountry skiing" => "winter activities"
      case _ => "unknown"
    }

  def runType(miles: Double): String =
    miles match {
      case x if x > 0 && x < 3 => "shakeout"
      case x if x >= 3 && x < 7 => "regular run"
      case x if x >= 7 && x < 10 => "longer run"
      case x if x >= 10 => "long run"
      case _ => "invalid mileage"
    }
}

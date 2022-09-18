/**
 * Example of a Scala class
 *
 * Date: 9/18/2022
 * @author Andrew Jarombek
 */

class Exercise(val exerciseType: String, val date: String, val miles: Double) {
  override def toString: String =
    s"$exerciseType for $miles miles on $date"
}

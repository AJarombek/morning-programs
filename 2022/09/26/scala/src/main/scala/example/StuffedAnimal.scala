package example

/**
 * Basic Scala class for a stuffed animal.
 *
 * Date: 9/26/2022
 *
 * @author Andrew Jarombek
 */

class StuffedAnimal(val name: String, val species: String) {
  implicit final class AnyOps[A](self: A) {
    def ===(other: A): Boolean = self == other
    def !==(other: A): Boolean = self != other
  }

  override def equals(obj: Any): Boolean = {
    obj match {
      case obj: StuffedAnimal => this.name == obj.name && this.species == obj.species
      case _ => false
    }
  }
}

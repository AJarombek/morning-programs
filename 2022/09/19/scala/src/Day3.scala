import Exercise.Strength

/**
 * Basic Scala code for the third day of exploration
 *
 * Date: 9/19/2022
 * @author Andrew Jarombek
 */

object Day3 {
  def main(args: Array[String]): Unit = {
    // The 'new' keyword is not mandatory to instantiate case classes.
    val atHome = Strength("9/18/2022", "00:36:56", "Hip Flexors")
    val pt = Strength("9/19/2022", "00:25:00", "Hip Flexors")

    // Case classes implement default definitions for toString(), equals(), and hashCode().
    println(atHome)
    println(atHome.toString)

    // Assert doesn't require a command line flag to work in Scala (unlike Java).  It works by default.
    assert(!atHome.equals(pt))

    val ptClone = Strength("9/19/2022", "00:25:00", "Hip Flexors")
    assert(pt.equals(ptClone))

    val hash1 = pt.hashCode()
    val hash2 = ptClone.hashCode()
    val hash3 = atHome.hashCode()

    assert(hash1 == hash2)
    assert(hash2 != hash3)

    // Scala allows variables to have explicitly written types, although this
    // usually isn't the preferred approach.  If types are not explicitly written,
    // Scala infers the type of a variable.
    var i: Int = 1
    val j: Int = 2

    // Able to increment a mutable variable declared with var.
    i += 1

    // Compile time error: Reassignment to val.  val creates an immutable variable.
    // j += 1

    assert(i == j);
    i = 1

    // if..else statements return a value in Scala (unlike Java).
    val result = if (j > i) j else i
    assert(result == 2)

    // match statements are Scala's equivalent to Java's switch statements.
    var injured = true

    val trainingPlan = injured match {
      case true => "Cross Train"
      case false => "Run!"
    }

    // == for strings in Scala performs a value check instead of reference check.
    // In Java we would have to use equals() for value equivalence.
    assert(trainingPlan == "Cross Train")
    assert(trainingPlan.equals("Cross Train"))

    // Using a match statement as a function return value.
    def getTrainingPlan(injured: Boolean): String = injured match {
      case true => "Cross Train"
      case false => "Run!"
    }

    assert(getTrainingPlan(injured) == "Cross Train")
    assert(getTrainingPlan(injured).equals("Cross Train"))

    injured = false

    assert(getTrainingPlan(injured) == "Run!")
    assert(getTrainingPlan(injured).equals("Run!"))
  }
}
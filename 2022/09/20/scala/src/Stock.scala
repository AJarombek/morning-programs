/**
 * Example of a Scala class that extends a trait.
 *
 * Date: 9/20/2022
 * @author Andrew Jarombek
 */

class Stock(val stockSymbol: String, val companyName: String) extends TickerSymbol {
  override def symbol: String = stockSymbol
  override def company: String = companyName
}

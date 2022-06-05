package openengine

object Main extends App {
  val myOrder: Order = new Order(1.00,"BUY",1.01)

  val symbol = new Symbol("FB")
  val book = new Book(symbol)

  book.map.placeOrder(myOrder)
  book.map.placeOrder(new Order(1.11,"SELL",1.09))
  book.map.placeOrder(new Order(1.01,"BUY",1.02))
  book.map.placeOrder(new Order(1.20,"SELL",1.17))
}
package openengine
import scala.collection.mutable
import scala.collection.mutable.{ListBuffer, Map}

class OrderQueueMap {
  val ordersMap: mutable.Map[Double,OrderQueue] = mutable.Map()

  def match(): Unit = {
    //ordersMap.retain((price,queue) queue.)
  }

  def placeOrder(order: Order): Unit = {
    val price = order.price

    if (!(ordersMap.contains(price))) {
      ordersMap += (price -> new OrderQueue {
        override val orders: ListBuffer[Order] = new ListBuffer()
      })
    }

    ordersMap(price).orders += order
    // todo match()
    // todo DELETE THIS
    print("inserted an order\n")
  }
}
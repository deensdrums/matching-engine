package openengine

import scala.collection.mutable.ListBuffer

abstract class OrderQueue() {
  val orders: ListBuffer[Order]

  def getFirstOrder(): Unit = {
    orders(0)
  }
}

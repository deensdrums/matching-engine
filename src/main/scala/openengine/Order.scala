package openengine

class Order(val price: Double, val action: String, val limit: Double) {

  //TODO turn this in to a log event
  print("order event\n")
}
package OOPs_1

import scala.collection.mutable.ListBuffer

class Square_Queue(list: ListBuffer[Int]) extends Queue {
  for (i <- list.indices) {
    list.update(i, list(i) * list(i))
  }

}

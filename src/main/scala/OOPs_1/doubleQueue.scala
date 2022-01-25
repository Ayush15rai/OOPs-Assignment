package OOPs_1

import scala.collection.mutable.ListBuffer

class doubleQueue(list: ListBuffer[Int]) extends Queue {
  for ( i <- list.indices){
    list.update(i, 2 * list(i))
  }

}

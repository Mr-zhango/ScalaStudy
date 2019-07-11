package cn.myfreecloud.chapter04

object RangeFor {
  def main(args: Array[String]): Unit = {


    /**
      *
      * 1:开始值
      * 2:结束值
      * 3:步长
      */
    for (i <- Range(1, 10, 2)) {
      println("i=" + i)
    }


    println("###################")


    /**
      * guard
      */
    for (i <- 1 to 10 if i % 2 == 1) {
      println("i=" + i)
    }


  }
}

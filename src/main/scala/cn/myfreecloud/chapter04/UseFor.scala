package cn.myfreecloud.chapter04

object UseFor {
  def main(args: Array[String]): Unit = {
    for (i <- 1 to 3; j = i * 2) {
      println("i=" + i + "j=" + j)
    }


    println("等价于")
    for {
      i <- 1 to 3
      j = i * 2} {
      println("i=" + i + "j=" + j)
    }
  }


}

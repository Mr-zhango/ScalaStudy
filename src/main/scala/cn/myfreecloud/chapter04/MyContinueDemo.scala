package cn.myfreecloud.chapter04

object MyContinueDemo {
  def main(args: Array[String]): Unit = {

    //使用循环守卫的方式
    for (i <- 1 to 10 if (i != 2 && i != 3)) {
      println("i=" + i)
    }

    println("#############")

    //采用判断的形式
    for (i <- 1 to 10) {
      //相当于continue
      if (i != 2 && i != 3) {
        println("i=" + i)
      }
    }

  }
}

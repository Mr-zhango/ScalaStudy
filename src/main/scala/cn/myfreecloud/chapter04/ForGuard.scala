package cn.myfreecloud.chapter04

/**
  * 循环守卫
  */
object ForGuard {
  def main(args: Array[String]): Unit = {
    for (i <- 1 to 3 if i != 2) {
      println(i + " ")
    }
    println("####结束#####")


    /**
      * 等价代码
      *
      */
    for (i <- 1 to 3) {
      if(i!=2){
        println(i + " ")
      }

    }


    println("########新案例开始#############")
    for (i <- 1 to 3 ; j = 4 - i){
      println(j)
    }

    println("等价代码")
    for (i <- 1 to 3){
      val j = 4 -i
      println(j)
    }


    println("########新案例结束#############")


  }


}

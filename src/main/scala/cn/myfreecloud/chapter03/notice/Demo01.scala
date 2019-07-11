package cn.myfreecloud.chapter03.notice

object Demo01 {

  def main(args: Array[String]): Unit = {
    val num = if (5 > 4) 5 else 4

    //scala取消了三元
    // val num = 5 > 4 ? 5: 4

    /**
      * 案例1：求两个数的最大值
      * 案例2：求三个数的最大值
      */
    val n1 = 4
    val n2 = 8
    val n3 = 99
    val res = if(n1>n2) n1 else n2

    println("res="+res)

    val res2 = if(res > n3) res else n3

    println(res2)
  }
}

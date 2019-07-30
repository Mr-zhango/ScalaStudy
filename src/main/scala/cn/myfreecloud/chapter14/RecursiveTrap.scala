package cn.myfreecloud.chapter14

/**
  * 注意递归使用时候的陷阱
  * 使用斐波那契函数来演示
  *
  * 注意:递归调用的时候注意重复调用
  *
  */
object RecursiveTrap {
  def main(args: Array[String]): Unit = {


    var count = BigInt(0)
    println(fbn(35))

    println("递归的次数是:" + count)

    /**
      * 研究递归调用的次数增长
      *
      * @param n
      * @return
      */
    def fbn(n: BigInt): BigInt = {
      count += 1
      if (n == 1 || n == 2)
        1
      else
        fbn(n - 1) + fbn(n - 2)
    }

  }


}


package cn.myfreecloud.chapter14

object RecursiveFactorial {
  def main(args: Array[String]): Unit = {
    val result = myFactorial(10)

    println(result)
  }

  /**
    * 求阶乘函数
    */

  def myFactorial(n: Int): Int = {
    if (n == 0)
      1
    else
    //如果长度>1,就执行递归反转
      myFactorial(n - 1 ) * n
  }

}

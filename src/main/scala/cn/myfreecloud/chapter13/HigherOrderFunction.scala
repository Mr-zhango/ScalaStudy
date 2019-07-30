package cn.myfreecloud.chapter13

object HigherOrderFunction {

  /**
    * 高阶函数可以接收多个函数,并且函数之间可以相互调用
    * @param args
    */
  def main(args: Array[String]): Unit = {
    def test(f: Double => Double, f2: Double =>Int ,  n1: Double) = {
      f(f2(n1)) // f(0)
    }
    //sum 是接收一个Double,返回一个Double
    def sum(d: Double): Double = {
      d + d
    }


    /**
      * 取模的函数
      * @param d
      * @return
      */
    def mod(d:Double): Int = {
      d.toInt % 2
    }

    val res = test(sum, mod, 6.0) //
    println("res=" + res) // 2.0

  }
}

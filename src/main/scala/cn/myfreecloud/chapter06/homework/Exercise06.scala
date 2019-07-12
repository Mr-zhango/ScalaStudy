package cn.myfreecloud.chapter06.homework

object Exercise06 {
  def main(args: Array[String]): Unit = {
    var res = 1L
    var res2 = 1L
    //这里我们解释
    //1.
    //"Hello".foreach(res *= _.toLong)
    //println("res=" + res)

    "Hello".foreach(myCount)
    println("res=" + res)

    //注意:这里的_相当于每次遍历出来的元素 函数式编程,传递代码
    "Hello".foreach(res2 *= _.toLong)
    println("res2=" + res2)

    def myCount(char: Char): Unit = {
        res *= char.toLong
    }
  }


}

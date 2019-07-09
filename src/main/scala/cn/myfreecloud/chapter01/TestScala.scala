package cn.myfreecloud.chapter01

/**
  * @author: zhangyang
  * @date: 2019/7/3 21:17
  * @description: 看到有object,就像想到这个object对应的 TestScala$这样一个静态的对象,在程序中是一个单例的对象
  */
object TestScala {
  def main(args: Array[String]): Unit = {
    println("hello")
    var num1 : Int = 10
    var num2 : Int = 20

    println(num1 + num2)

  }
}

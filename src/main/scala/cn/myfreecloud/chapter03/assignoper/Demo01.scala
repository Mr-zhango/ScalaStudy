package cn.myfreecloud.chapter03.assignoper

object Demo01 {
  def main(args: Array[String]): Unit = {
    var num = 2
    num <<= 2
    println(num)

    num >>= 3
    println(num)

    //在scala中支持代码块,返回值

    val res = {
      if (num > 1)
        "hello world"
      else
        100
    }

    println("res=" + res)
  }

}

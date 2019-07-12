package cn.myfreecloud.chapter06.homework

object Exercise07 {


  def main(args: Array[String]): Unit = {
    val result  = product("Hello")
    println(result)
  }

  /**
    * 编写一个函数product(s:String) 计算字符串中所有字母的Unicode代码(toLong方法)的乘积
    */

  def product(s: String): Long = {
    var r: Long = 1L
    for (i <- s) {
      r *= i.toLong
    }
    r
  }

}

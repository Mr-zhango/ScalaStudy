package cn.myfreecloud.chapter01

/**
  * @author: zhangyang
  * @date: 2019/7/4 15:57
  * @description:
  */
object Comment {
  def main(args: Array[String]): Unit = {
    println("hello world")
  }


  /**
    * @deprecated
    * @example
    *          输入你n1整数,n2整数,返回求和的结果 sum
    * @param n1
    * @param n2
    * @return 两个整数的和
    */
  def sum(n1:Int,n2:Int): Int = {

    return n1 + n2
  }
}

package cn.myfreecloud.chapter04

object MyWhile {


  /**
    * 不推荐使用while循环,因为
    * @param args
    */
  def main(args: Array[String]): Unit = {
    //定义循环变量
    var i = 0
    //设置循环条件
    while (i < 10) {
      println("hello:" +i)
      i += 1
    }
  }

}

package cn.myfreecloud.chapter04

object ifelse {
  def main(args: Array[String]): Unit = {
    val age = 6
    if (age > 18) {
      println("成年了")
    } else {
      println("未成年哦")
    }
  }
}

package cn.myfreecloud.chapter02.dataconvert

object String2Basic {
  def main(args: Array[String]): Unit = {
    val d1 = 1.2
    val s1 = d1 + ""

    println(s1)

    val s2 = "12"

    val num1 = s2.toInt
    val num2 = s2.toByte
    val num3 = s2.toDouble
    val num4 = s2.toLong

    val s3 = "12.5"
    val num5 = s3.toInt

    println(num5)
  }
}

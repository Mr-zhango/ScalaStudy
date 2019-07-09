package cn.myfreecloud.chapter01.vars

/**
  * @author: zhangyang
  * @date: 2019/7/4 16:31
  * @description:
  */
object VarDemo01 {
  def main(args: Array[String]): Unit = {
    var age: Int = 10
    var sal: Double = 10.9
    var name: String = "tom"
    var isPass: Boolean = true

    //在scala中小数默认为Double类型整数默认为Int类型
    var score: Float = 70.9f

    println(s"${age} ${isPass}")

  }
}

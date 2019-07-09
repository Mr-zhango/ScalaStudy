package cn.myfreecloud.chapter02.datatype

/**
  * @author: zhangyang
  * @date: 2019/7/5 10:04
  * @description:
  */
object TypeDemo03 {
  def main(args: Array[String]): Unit = {
    println("Long的最大值是:"+Long.MaxValue+"----"+Long.MinValue)

    var i = 10
    var j = 10L


    var e = 125453434343543434L  //Float 4个字节
    var f = 125453434343543434343D //Double 8个字节


    var num1: Float = 2.2345678912F  //2.2345679  低精度,精确到小数点后7位

    var num2: Double = 2.2345678912D  //2.2345678912 高精度类型

    println( "num1:"+num1 + "num2:"+num2)




  }
}

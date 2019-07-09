package cn.myfreecloud.chapter02.datatype

/**
  * @author: zhangyang
  * @date: 2019/7/5 10:16
  * @description:
  */
object CharDemo {
  def main(args: Array[String]): Unit = {
    var char1: Char = 97

    //当我们输出一个char类型的时候,会查询unicod码(包含了ASCII码)
    println(char1)

    //char也可以当做数值来进行计算

    var char2: Char = 'a'
    var num = 10 + char2 //97+10=107
    println(num)


    //原因分析:
    //1.当我们把一个计算的结果赋值给一个变量的时候,则编译器会进行类型转化以及数据判定(会判定数据的范围和类型)
    //2.当我们把一个字面量赋值一个变量的时候,则编译器会进行范围的判定
//    var c2: Char = 'a' + 1
//    var c3: Char = 97 + 1
//    var c4: Char = 98
//    var c5: Char = 989999


  }

}

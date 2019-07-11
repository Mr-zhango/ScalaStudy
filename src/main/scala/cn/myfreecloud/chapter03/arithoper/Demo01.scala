package cn.myfreecloud.chapter03.arithoper

object Demo01 {
  def main(args: Array[String]): Unit = {


    /**
      * 细节说明
      *
      * 对于除号“/”，它的整数除和小数除是有区别的：整数之间做除法时，只保留整数部分而舍弃小数部分。 例如：var x : Int = 10/3 ,结果是  3
      * 当对一个数取模时，可以等价 a%b=a-a/b*b ， 这样我们可以看到取模的一个本质运算(和java 的取模规则一样)。
      *
      */
    var r1: Int = 10 / 3
    println("r1=" + r1)
    var r2: Double = 10 / 3
    println("r2=" + r2)
    var r3: Double = 10.0 / 3
    println("r3=" + r3)
    println("r3=" + r3.formatted("%.2f")) //

    println("###################")
    //%的使用

    println(10 % 3) //1
    println(-10 % 3) //-1
    println(10 % -3)
    println(-10 % -3)

    // ++ 和 --
    //说明,在scala中没有++和--这种操作 ,需要使用+=   -= 的形式

    var num1 =10

    num1 +=1

    num1 -= 1

    println(num1)
  }
}

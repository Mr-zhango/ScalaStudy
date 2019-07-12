package cn.myfreecloud.chapter06.homework

object Exercise03 {
  def main(args: Array[String]): Unit = {

    //定义List集合
    val list = List(1, 2, 3)
    println("原来的集合是:"+list)

    println("reverse之后的集合是:"+list.reverse) //(3,2,1)

    val listRange = (1 to 10).reverse
    println(listRange) //

  }
}

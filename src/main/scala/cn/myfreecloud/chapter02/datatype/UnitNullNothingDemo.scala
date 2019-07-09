package cn.myfreecloud.chapter02.datatype

/**
  * @author: zhangyang
  * @date: 2019/7/5 10:34
  * @description:
  */
object UnitNullNothingDemo {
  def main(args: Array[String]): Unit = {
    val res = sayHello()

    //返回的是()
    println("res:"+res)

    //
  }

  //注意:unit等价于java的void的值,只有一个实例 ()

  def sayHello(): Unit = {

  }

  //Null类只有一个实例对象，null，类似于Java中的null引用。
  // null可以赋值给任意引用类型(AnyRef)，
  // 但是不能赋值给值类型(AnyVal: 比如 Int, Float, Char, Boolean, Long, Double, Byte, Short)
  val dog: Dog = null

  //执行报错
  //val char1: Char = null

  println(1111)



}

class Dog {

}

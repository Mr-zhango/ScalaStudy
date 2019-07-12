package cn.myfreecloud.chapter06.oop

object MemoryStatus {

  /**
    * scala的对象的使用和java是一样的
    * @param args
    */
  def main(args: Array[String]): Unit = {
    val p11111 = new Person6666

    p11111.name ="jack"
    p11111.age=10

    val p2 = p11111

    println(p11111 == p2)
    p11111.name = "tom"

    println(p2.name)
  }
}

class Person6666 {
  var name =""
  var age:Int = _ //如果用_来进行自动赋值的时候,我们需要制定数据的类型,不然不知道默认值是多少

}
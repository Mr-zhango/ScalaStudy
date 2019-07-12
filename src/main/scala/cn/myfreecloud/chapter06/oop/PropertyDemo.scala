package cn.myfreecloud.chapter06.oop

object PropertyDemo {
  def main(args: Array[String]): Unit = {
    val p1 = new Person
    println(p1.Name)
    println(p1.address)
    println("#############")
    val a = new A
    println(a.var1)
    println(a.var2)
    println(a.var3)
    println(a.var4)

    //
    var worker1 = new Worker
    var worker2 = new Worker


    worker1.name = "jack"
    worker2.name = "rose"


  }

}

class Person {
  var age: Int = 10
  var sal = 8090.9 //给属性赋初值，省略类型，会自动推导
  var Name = null // Name 是什么类型?
  var address: String = null // address 是什么类型？
}

class A {
  var var1: String = _ //null
  var var2: Byte = _ //0
  var var3: Double = _ //0.0
  var var4: Boolean = _ //false

}


class Worker {
  var name = ""

}
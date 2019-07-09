package cn.myfreecloud.chapter01.vars

/**
  * @author: zhangyang
  * @date: 2019/7/4 16:40
  * @description:
  */
object VarDemo02 {
  def main(args: Array[String]): Unit = {
    //scala的类型推导
    var  num = 10 //这是number就是Int类型

    //判断一个变量的类型
    println(num.isInstanceOf[Int])

    //在定义一个变量的时候,可以送var或者val
    //var修饰的变量是可以改变的

    var age = 10
    age = 40
    //val修饰的变量是不可以修改的
    val age2222 = 50
    //age2222 = 60  编译出错

    //val的产生原因
    //因为我们在开发的时候,我们更多的是获取/创建一个对象之后,获取该对象的属性,或者是修改该对象的属性值,但是我们很少去改变这个对象本身
    //这时,我们就可以使用val
    //因为val没有线程安全问题,因此效率比较高,所以scala设计者推荐我们尽量使用val

    //如果对象真的需要变化,则使用val

//    val dog = new Dog
//
//    dog = new Dog
        val dog = new Dog
        dog.age = 20
        dog.name = "小小"
  }
}

class Dog{
  //声明一个age
  var age: Int = 0
  //声明一个名字
  var name: String = ""
}

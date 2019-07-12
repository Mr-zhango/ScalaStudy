package cn.myfreecloud.chapter06.oop

object CreateObj {
  def main(args: Array[String]): Unit = {
    val emp  = new Emp

    //如果我们希望将子类的对象交给父类的一个引用,这是就需要协商类型了
    val emp2: Person = new Person



  }

}

class Person888{

}


class Emp extends Person888 {

}
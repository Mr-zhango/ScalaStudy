package cn.myfreecloud.chapter05.functiondetails

object Method2Function {
  def main(args: Array[String]): Unit = {

    val dog = new Dog

    val result = dog.sum(1,3)
    println(result)

    println("######")

    //方法转函数
    val f1 = dog.sum _

    println("f1="+f1)

    //定义一个函数
    val f2 = (n1: Int, n2: Int) => {n1 + n2}

    println("f2:="+f2)
    println("f2:="+f2(5,6))
  }



}


class Dog{
  //定义一个求和的方法
  def sum(n1: Int, n2: Int): Int = {
    n1 + n2
  }
}
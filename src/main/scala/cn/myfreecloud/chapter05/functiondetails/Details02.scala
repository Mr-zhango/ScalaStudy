package cn.myfreecloud.chapter05.functiondetails

object Details02 {
  def main(args: Array[String]): Unit = {
    val result = getSumHaveReturn02(10, 20)
    println(result)

    val result1 = getSumHaveReturn03(10, 20)
    println(result1)
  }

  //不加return和 :Unit的时候,Scala自己进行类型推断,如果写了return语句,Scala的自行推断失效,必须明确指定返回值的类型
  def getSum(n1: Int, n2: Int) = {
    n1 + n2
  }

  def getSumAuto(n1: Int, n2: Int) = {
    n1 + n2
  }


  //如果写了return语句,Scala的自行推断失效,必须明确指定返回值的类型
  def getSumHaveReturn(n1: Int, n2: Int): Int = {
    return n1 + n2
  }

  //标识这个函数没有返回值,这时候加了return也没有用,没有返回值 返回() Unit
  def getSumHaveReturn02(n1: Int, n2: Int) {
    return n1 + n2
  }

  //如果函数明确声明无返回值,(声明Unit),那么函数体中使用return 关键字也不会有返回值
  def getSumHaveReturn03(n1: Int, n2: Int): Unit = {
    return n1 + n2
  }

  
  def f3(s: String) = {
    if (s.length >= 3)
      s + "123"
    else
      3
  }

  def f4(s: String): Any = {
    if (s.length >= 3)
      s + "123"
    else
      3
  }

}

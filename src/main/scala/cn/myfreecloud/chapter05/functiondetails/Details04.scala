package cn.myfreecloud.chapter05.functiondetails

object Details04 {
  def main(args: Array[String]): Unit = {
    /**
      * Scala函数的形参，在声明参数时，直接赋初始值(默认值)，这时调用函数时，如果没有指定实参，则会使用默认值。如果指定了实参，则实参会覆盖默认值
      */

    println(sayOk())
    println(sayOk("tom"))


    //注意:形参的默认值是jack
    def sayOk(name : String = "jack"): String = {
      return name + " ok! "
    }

  }

}

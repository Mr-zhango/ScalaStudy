package cn.myfreecloud.chapter05.myexception

object ThrowDemo {
  def main(args: Array[String]): Unit = {

    try {
      test()
    } catch {
      case ex: Exception  => println("捕获到异常"+ex.getMessage)
    }finally {
      println("finally")

      //写上对try中中的资源的分配
    }
    //打印上一级扔出的异常信息
    //println(res.toString)

    println("检验是否能够输出!!")

    //如果我们想要在test()异常抛出之后,代码可以继续运行,我们就需要对异常进行处理

  }

  def test(): Nothing = {
    throw new Exception("异常出现!!! No:001")
  }


}

package cn.myfreecloud.chapter05.myexception

object ScalaExceptionDemo {

  def main(args: Array[String]): Unit = {

    /**
      * 说明:
      * 1.在scala中只要一个catch
      * 2.在catch中有多个case,每个case可以匹配一种异常 case es:
      * 3.=> 是关键符号,表示后面对该异常的处理代码块
      * 4.finally,最终要执行的代码
      */
    try {
      val r = 10 / 0
    } catch {
      case ex: ArithmeticException => println("捕获了除数为零的算数异常")
      case ex: Exception => println("捕获了异常")
    } finally {
      // 最终要执行的代码
      println("scala finally...")
    }

    println("try - catch 之外的代码继续执行 ")
  }
}

package cn.myfreecloud.chapter04

import util.control.Breaks._

object MyWhileBreak {
  def main(args: Array[String]): Unit = {

    var n = 1

    breakable{
      while (n < 20) {

        n += 1

        println("n=" + n)
        if (n == 18) {
          //在scala中使用break函数来中断循环
          break()
        }
      }
  }

    println("ok-----")

    //注意:break函数,可以使用在for循环或者do...while循环中去

    //breakable必须要,不然会抛异常,影响执行
    breakable{
      for (i <- 1 to 100){
        println("i="+i)
        if(i == 20){
          break()
        }
      }
    }


  }
}

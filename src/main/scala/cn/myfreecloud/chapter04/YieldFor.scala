package cn.myfreecloud.chapter04

object YieldFor {
  def main(args: Array[String]): Unit = {

    //遍历,然后把每一次循环得到的i放入到集合Vector中,并且返回res
    val res = for (i <- 1 to 10) yield i

    println(res)

    //这里可是是代码块,可以对i进行逻辑处理
    val res2 = for (i <- 1 to 10) yield i * 2

    println(res2)

    val res3 = for (i <- 1 to 10) yield {
      if(i % 2 == 0){
        i
      }else{
        "不是偶数"
      }
    }

    println(res3)

  }
}

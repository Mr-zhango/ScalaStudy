package cn.myfreecloud.chapter04

object ForControl {
  def main(args: Array[String]): Unit = {

    val start =1
    val end = 10

    //start 从哪个数开始循环
    //to    是关键字
    //end 循环结束的值 start to end 标识前后闭合
    for(i <- start to end) {
      println("Hello World"+i)
    }


    println("###############################")
    //直接 遍历list集合
    var list = List("hello",10,20,"jack")

    for (item <- list){
        println(item)
    }


    // //end 循环结束的值 start until end 不包含后面
    for (j <- start until end){
      println(j)
    }


  }
}

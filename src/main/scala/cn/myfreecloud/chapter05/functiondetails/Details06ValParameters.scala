package cn.myfreecloud.chapter05.functiondetails

object Details06ValParameters {
  def main(args: Array[String]): Unit = {
    println(sum(10,1,1,1,1))
  }


  //可变参数只能写在参数列表的最后
  def sum(n1: Int, args: Int*): Int = {
    println("argus.length" + args.length)

    //遍历
    var sum = 0
    for (item <- args) {
      sum += item
    }
    sum
  }

}

package cn.myfreecloud.chapter14

object RecursiveReverseString {
  def main(args: Array[String]): Unit = {

    val str = myreverse("123456789")
    println(str)


  }


  /**
    * 使用递归调用完成对字符串的反转
    */

  def myreverse (s: String): String ={
    if(s.length == 1)
      s
    else
    //如果长度>1,就执行递归反转
      myreverse(s.tail) + s.head
  }

}

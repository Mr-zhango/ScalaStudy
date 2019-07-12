package cn.myfreecloud.chapter06.homework

object Exercise09 {
  def main(args: Array[String]): Unit = {
    val result = productRecursion("Hello")
    println(result)
  }

  def productRecursion(s: String): Long = {
    //如果字符串的长度是1,就取出来第一个计算后直接返回,否则进行递归计算
    if(s.length == 1){
       s.charAt(0).toLong
    }else{
      //如果字符串的长度不止一位,  s.take(1)就是返回s的第一个字符(String类型的)
      //                         s.drop(1)就是返回s字符串除去第一个字符后面的所有的字符(String)
      s.take(1).charAt(0).toLong*productRecursion(s.drop(1))
    }
  }
}

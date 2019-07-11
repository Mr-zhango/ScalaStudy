package cn.myfreecloud.chapter05.functiondetails

object Details06Recursive {
  def main(args: Array[String]): Unit = {

  }


  /**
    * 这是错误的呢,必须制定返回值
    * def f1(n:Int) = {
    * if(n==1){
    * 1
    * }else{
    * f1(n-1)
    * }
    * }
    *
    * @param n
    * @return
    */
  def f1(n:Int): Int ={
    if(n==1){
      1
    }else{
      f1(n-1)
    }
  }
}

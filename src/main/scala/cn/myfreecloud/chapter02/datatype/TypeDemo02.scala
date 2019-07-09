package cn.myfreecloud.chapter02.datatype

/**
  * @author: zhangyang
  * @date: 2019/7/4 17:41
  * @description:
  */
object TypeDemo02 {
  def main(args: Array[String]): Unit = {
      println(sayHello)

    var num = 1.2
    var num2 = 1.7f

//    num2=num  //类型转化异常

    num2=num.toFloat
  }

  //比如在开发中,我们有一个方法,就会异常中断,这时就可以返回nothing
  //当我们用nothing做返回值时,就是明确说名,该方法没有正常的返回值
  def sayHello: Nothing ={
    throw new Exception("抛出异常")
  }

  def sayHello2: Unit ={
    throw new Exception("抛出异常")
  }
}

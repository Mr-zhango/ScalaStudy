package cn.myfreecloud.chapter07.homework

import scala.beans.BeanProperty

object Exercise02 {
  def main(args: Array[String]): Unit = {
    println("ok")
  }
}

class Student {
  //读写属性
  @BeanProperty var  name: String = _
  @BeanProperty var id: Long = _
}

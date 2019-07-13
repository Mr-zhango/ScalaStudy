package cn.myfreecloud.chapter06.constructor

object ConDemo02 {
  def main(args: Array[String]): Unit = {
    val a = new AA("jack")

  }

}


class BB {
  //调用AA的时候会首先 顺带的调用父类BB的主构造器的方法
  println("BBBBBBBBBBB")
}

class AA extends BB{
  println("AA")
  def this(name: String){
    this
    println("A this(name: String)")
  }
}
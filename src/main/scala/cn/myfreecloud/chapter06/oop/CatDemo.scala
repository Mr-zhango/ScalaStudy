package cn.myfreecloud.chapter06.oop

object CatDemo {
  def main(args: Array[String]): Unit = {

    //创建一只猫
    val cat = new Cat
    //给猫的属性赋初值
    cat.name = "小白猫一号"
    cat.age = 10
    cat.color = "白色"

    printf("小猫的信息如下: %s %d %s" ,cat.name ,cat.age,cat.color)
  }

}
//一个calss对应一个字节码文件.class,默认是public的
class Cat {
  //声明三个属性

  //说明:当我们声明了var name: String 时,对应private name
  //同时会生成两个pubic的方法,一个方法是name() 类似getter方法,  一个是$eq() 类似于Setter
  var name: String = ""   //给初始值,java默认给初始值,Scala没有给,所以我们要手动进行初始化操作
  var age: Int = _ //_表示给一个默认的值,如果是Int,默认就是0
  var color: String = _ //_ String 的默认值是""


}

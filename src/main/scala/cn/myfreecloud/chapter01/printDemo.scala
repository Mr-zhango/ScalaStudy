package cn.myfreecloud.chapter01

/**
  * @author: zhangyang
  * @date: 2019/7/4 14:17
  * @description:
  */
object printDemo {
  def main(args: Array[String]): Unit = {
    var str1:String = "hello"
    var str2:String = "world"

    println(str1 + str2)

    var name:String = "tom"
    var age:Int = 20
    var sal:Float = 10.67f
    var height:Double = 180.11

    //格式化输出 s,string类型  d整数类型 f
    printf("名字是=:%s,年龄是:%d 薪水是:%.2f  身高是:%.3f",name,age,sal,height)

    //scala支持使用$输出内容 编译器回去解析$对应的变量,在编译之后就已经去确定了
    println(s"个人信息如下:\n名字:$name\n年龄:$age\n 薪水:$sal")

    println(s"个人信息如下:\n名字:${name}\n年龄:${age+10}\n 薪水:${sal * 100}")

  }
}

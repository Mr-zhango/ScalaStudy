package cn.myfreecloud.chapter02.identify

object IdentifyDemo01 {
  def main(args: Array[String]): Unit = {
    //首字符可以为操作符(比如 + -) 后续字符也需要跟操作符,只是由一个
    val ++  = "hello world"

    println(++)

    //因为底层已经做了编译阶段的处理,就不是真正的加减符号了

    //勇 `` 的话,特殊字符也可以用作操作符

    //scala额骚操作

    var `true` = "hello"

    println(`true`)

    val Int = 60.33

    val Float =123

    println(Int)

    println(Float)


  }
}

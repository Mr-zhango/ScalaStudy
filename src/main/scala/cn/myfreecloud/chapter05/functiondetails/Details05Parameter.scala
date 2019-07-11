package cn.myfreecloud.chapter05.functiondetails

object Details05Parameter {
  def main(args: Array[String]): Unit = {


    mysqlCon()
    mysqlCon("127.0.0.1", 123) //从左到右进行覆盖

    //如果我们希望只修改某一个默认值,则使用带名参数即可
    //修改用户名和密码
    mysqlCon(user = "tom", pwd = "123")

    def mysqlCon(add: String = "localhost", port: Int = 3306,
                 user: String = "root", pwd: String = "root"): Unit = {
      println("add=" + add)
      println("port=" + port)
      println("user=" + user)
      println("pwd=" + pwd)
    }

    //注意:递归不能使用自动类型推导,必须制定返回值类型
  }

}

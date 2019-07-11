package cn.myfreecloud.chapter05.recursive

/**
  * 递归调用的案例演示
  */
object Demo01 {
  def main(args: Array[String]): Unit = {

    test(4)
  }

  def test (n: Int) {
    if (n > 2) {
      test (n - 1)
    }
    println("n=" + n) //
  }

}

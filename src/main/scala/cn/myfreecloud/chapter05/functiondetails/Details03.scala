package cn.myfreecloud.chapter05.functiondetails

object Details03 {
  def main(args: Array[String]): Unit = {

    def f1(): Unit ={
      println("f1")
    }


    //地位和外部的方法的地位一样,只不过是修饰符发生了变化
    def sayOk(): Unit ={ //private final sayok$1
      println("ok")

      def sayOk(): Unit ={ //private final sayok$2
        println("inner say ok")
      }
    }

    println("test")
  }
  def sayOk(): Unit ={ //成员
    println("ok")
  }
}

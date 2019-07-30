package cn.myfreecloud.chapter14

object RecursiveMaxList {
  def main(args: Array[String]): Unit = {
    println(mymax(List(1,9,10,66)))
  }

  def mymax(xs: List[Int]): Int = {

    //如果为空,则抛出异常
    if (xs.isEmpty)
      throw new java.util.NoSuchElementException()
    if (xs.size == 1)
      xs.head
    else if (xs.head > mymax(xs.tail)) xs.head else mymax(xs.tail)
  }
}

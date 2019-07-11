package cn.myfreecloud.chapter05.functiondetails

object Details01 {
  def main(args: Array[String]): Unit = {
    //形参列表和返回值列表的数据类型可以是值类型和引用类型

    val tiger = new Tiger
    val tiger02 = test01(10,tiger)
    println(tiger02.name)
    println(tiger.name)

  }

  def test01(n1: Int, tiger: Tiger): Tiger = {
    println("n1=" + n1)
    tiger.name="jack"
    tiger
  }

}

class Tiger {
  //一个属性:名字
  var name = ""
}

package cn.myfreecloud.chapter05.functiondetails

object FunDemo01 {
  def main(args: Array[String]): Unit = {

    val result  = getRes(1,2,'-')
    println(result)
  }

  def getRes(n1:Int,n2:Int,oper:Char) ={
    if(oper == '+'){
      n1 + n2
    }else if(oper == '-'){
      n1 - n2
    }else{
      null
    }
  }
}

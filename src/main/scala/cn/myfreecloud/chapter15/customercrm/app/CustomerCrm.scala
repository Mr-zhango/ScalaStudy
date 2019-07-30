package cn.myfreecloud.chapter15.customercrm.app

import cn.myfreecloud.chapter15.customercrm.view.CustomerView

object CustomerCrm {
  def main(args: Array[String]): Unit = {

    new CustomerView().mainMenu()

  }
}

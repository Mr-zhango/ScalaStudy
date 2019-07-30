package cn.myfreecloud.chapter17.decorator.coffeebar.mydecorator

import cn.myfreecloud.chapter17.decorator.coffeebar.Drink


class Milk(obj: Drink) extends Decorator(obj) {

  setDescription("Milk")
  setPrice(2.0f)
}

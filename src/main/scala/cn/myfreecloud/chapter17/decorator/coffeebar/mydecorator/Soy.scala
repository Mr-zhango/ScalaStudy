package cn.myfreecloud.chapter17.decorator.coffeebar.mydecorator

import cn.myfreecloud.chapter17.decorator.coffeebar.Drink


class Soy(obj: Drink) extends Decorator(obj) {
  setDescription("Soy")
  setPrice(1.5f)
}

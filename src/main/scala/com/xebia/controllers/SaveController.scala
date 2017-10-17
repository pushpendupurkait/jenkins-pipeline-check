package com.xebia.controllers

class SaveController() {

  def showData(data:String):String = {
    println(data)
    data
  }

  def getData(data:Option[String]):String ={
    data match{
      case Some(word) => word
      case None => "No Word"
    }
  }

  val num = new Num
  num.add(1,2)
}

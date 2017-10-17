package com.xebia.controllers

import org.scalatest.FunSuite

class SaveControllerSpec extends FunSuite{

  val saveController = new SaveController()

  test("showData"){
    val result = saveController.showData("data")

    assert(result == "data")
  }

  test("getData"){
    val result = saveController.getData(Some("text"))

    assert(result == "text")
  }

}

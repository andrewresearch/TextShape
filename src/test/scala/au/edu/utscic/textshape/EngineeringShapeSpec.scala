package au.edu.utscic.textshape

/**
  * Created by andrew@andrewresearch.net on 4/11/16.
  */


import org.scalatest.FlatSpec

import org.scalatest._

abstract class UnitSpec extends FlatSpec with Matchers with
  OptionValues with Inside with Inspectors


class EngineeringShapeSpec extends UnitSpec {

  val eShape = new EngineeringShape

"Chunk" should "split a string based on newline characters" in {
  val testString = "line1\nline2"
  val result = eShape.chunk(testString)
  assert(result.length == 2)
  assert(result.apply(0)=="line1")
  assert(result.apply(1)=="line2")
}
  "Chunk" should "split a string based on multiple newlines" in {
    val testString = "line1\nline2\n\n\nline3"
    val result = eShape.chunk(testString)
    assert(result.length == 3)
    assert(result.apply(0)=="line1")
    assert(result.apply(1)=="line2")
    assert(result.apply(2)=="line3")
  }
  "Chunk" should "ignore starting and ending newlines" in {
    val testString = "\n\nline1\nline2\n\n\nline3\n"
    val result = eShape.chunk(testString)
    assert(result.length == 3)
    assert(result.apply(0)=="line1")
    assert(result.apply(1)=="line2")
    assert(result.apply(2)=="line3")
  }
  "Chunk" should "ignore white space between newlines" in {
    val testString = "\n \nline1 extended\nline2\n\n \nline3\n"
    val result = eShape.chunk(testString)
    assert(result.length == 3)
    assert(result.apply(0)=="line1 extended")
    assert(result.apply(1)=="line2")
    assert(result.apply(2)=="line3")
  }
}


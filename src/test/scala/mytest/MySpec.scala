package mytest

import org.scalatest.matchers.{MatchResult, Matcher, ShouldMatchers}

import scala.xml.{Node, NodeSeq}
import org.scalatest.FunSpec
import scala.collection.GenSeq

class MySpec extends FunSpec with ShouldMatchers with MyMatcher {

  describe("where is wrong?") {
    it("showOK") {
      val xml:GenSeq[Node] = <span>abc</span>
      xml should contn("b")

    }
  }
}

trait MyMatcher {
  class XmlMatcher(str: String) extends Matcher[GenSeq[Node]] {
    def apply(xml: GenSeq[Node]) = {
      val x = xml.toString.contains(str)
      MatchResult(
        x,
        "aaa",
        "bbb"
      )
    }
  }

  def contn(str: String) = new XmlMatcher(str)
}

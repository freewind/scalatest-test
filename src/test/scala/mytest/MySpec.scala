package mytest

import org.scalatest.matchers.{MatchResult, Matcher, ShouldMatchers}

import scala.xml.NodeSeq
import org.scalatest.FunSpec

class MySpec extends FunSpec with ShouldMatchers with MyMatcher {

  describe("where is wrong?") {
    it("showOK") {
      val xml = <span>abc</span>
      xml should contn("b")
    }
  }
}

trait MyMatcher {

  class XmlMatcher(str: String) extends Matcher[NodeSeq] {
    def apply(xml: NodeSeq) = {
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

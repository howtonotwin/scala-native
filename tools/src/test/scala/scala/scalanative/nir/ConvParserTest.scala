package scala.scalanative
package nir

import util.sh
import Shows._

import fastparse.all.Parsed
import org.scalatest._

class ConvParserTest extends FlatSpec with Matchers {

  "The NIR parser" should "parse conv operations" in {
    import Conv._
    val convs: Seq[Conv] = Seq(Trunc,
                               Zext,
                               Sext,
                               Fptrunc,
                               Fpext,
                               Fptoui,
                               Fptosi,
                               Uitofp,
                               Sitofp,
                               Ptrtoint,
                               Inttoptr,
                               Bitcast)
    convs foreach { conv =>
      val Parsed.Success(result, _) =
        parser.Conv.parser.parse(sh"$conv".toString)
      result should be(conv)
    }
  }

}
import scala.io.Source

object Euler009 {
  def digits =
    Source.fromURL(getClass.getResource("/euler008.txt")).mkString.replaceAll("\r\n","").toCharArray.map(x => x.asDigit)

  val answer  = digits.iterator.sliding(13).map( x => x.foldLeft(1L)(_*_)).max
}

Euler009.answer
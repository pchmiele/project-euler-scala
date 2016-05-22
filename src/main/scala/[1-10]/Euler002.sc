object Euler002 {
  lazy val fibonacciSeq: Stream[Int] =
    1 #:: 2 #:: fibonacciSeq.zip(fibonacciSeq.tail).map(x => x._1 + x._2)

  val max = 4000000

  def answer: Int = {
    fibonacciSeq
      .takeWhile(x => x < max)
      .filter(isOdd)
      .sum
  }

  def isOdd(x: Int): Boolean = {
    x % 2 == 0
  }
}

Euler002.answer
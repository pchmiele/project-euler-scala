import utils.Primes

object Euler010{
  val answer = Primes.InfiniteSequence.takeWhile( _< 2000000).foldLeft(0L)(_ + _)
}

Euler010.answer
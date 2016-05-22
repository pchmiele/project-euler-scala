import scala.math.sqrt

object Euler003 {
  val number :Long = 600851475143L

  def factors (n: Long) = {
    val upperBound  = sqrt(n).asInstanceOf[Long]
    (2L to upperBound).filter(x => n % x == 0)
  }

  def isPrime (n: Long) :Boolean = n match {
    case 1 | 2 => true
    case _ => factors(n).isEmpty
  }

  def answer = factors(number).filter(isPrime).last
}

Euler003.answer
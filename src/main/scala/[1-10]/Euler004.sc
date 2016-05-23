object Euler004 {
  val twoDigitNumbers = 100 to 999

  val products = twoDigitNumbers.flatMap(x => twoDigitNumbers.map(y => x * y))

  def isPalindrome (n: Int) = {
    val number :String = n.toString
    val reverseNumber :String = {
      number.toCharArray.reverse mkString ""
    }

    number == reverseNumber
  }

  def answer = products.filter(isPalindrome).sorted.last
}

Euler004.answer
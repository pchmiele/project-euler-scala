object Euler006 {
  def sumOfSquares (numbers: Range) :Long = {
    numbers.map(n => n * n).sum
  }

  def squareOfSums (numbers: Range) :Long = {
    val sum = numbers.sum
    sum * sum
  }

  val numbers :Range= 1 to 100
  val answer = squareOfSums(numbers) - sumOfSquares(numbers)
}

Euler006.answer
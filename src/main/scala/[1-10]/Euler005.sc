object Euler005 {
  def numbers :Range = 20 to Int.MaxValue by 20

  val dividends :Range = 1 to 20

  val answer = numbers.view.find {
                                   n => dividends.forall(x => n % x == 0L)
                                 }
}

Euler005.answer
object Euler009 {
  def isPythagoreanTriplet(a: Int, b: Int, c: Int) :Boolean =
    a * a + b * b == c * c

  def isSpecialPythagoreanTriplet(a: Int, b: Int, c: Int) :Boolean =
    isPythagoreanTriplet(a, b, c) && (a + b + c == 1000)

  val triplets =
    for (a  <- 1 to 1000;
         b <- 1 to 1000;
         c <- 1 to 1000
         if isSpecialPythagoreanTriplet(a,b,c)
    )
      yield (a,b,c)


  def answer: Int = triplets.map(t => t._1 * t._2 * t._3).head
}

Euler009.answer
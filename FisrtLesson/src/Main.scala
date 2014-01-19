object Main extends App {


  def getSum(x: Double, y: Double): Double = x + y

  def sqrt(x: Double): Double = {

    def sqrtIter(guess: Double): Double =
    if (isGoodEnough(guess)) guess
    else sqrtIter(improve(guess))

  def isGoodEnough(guess: Double) =
    abs(guess * guess - x) / x < 0.001

  def abs(x: Double) = if (x < 0) -x else x

  def improve(guess: Double) =
    (guess + x / guess) / 2

  sqrtIter(1.0)
  }

  println(sqrt(2), " sqrt(2)")
  println(sqrt(0.001), " sqrt(0.001)")
  println(sqrt(1.00e20), " sqrt(1.00e20)")
}

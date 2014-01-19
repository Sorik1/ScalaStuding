/**
 * Created by Dmitriy on 1/20/14.
 */
class ArithmeticUtil {

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

}


object Main extends App {


  def getSum(x: Double, y: Double): Double = x + y

  val arithmeticUtil = new ArithmeticUtil

  println(arithmeticUtil.sqrt(2), " sqrt(2)")
  println(arithmeticUtil.sqrt(0.001), " sqrt(0.001)")
  println(arithmeticUtil.sqrt(1.00e20), " sqrt(1.00e20)")

}

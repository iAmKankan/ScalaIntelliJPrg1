import scala.annotation.tailrec

class Rational(n: Int, d: Int) {
  private def gcd(x: Int, y: Int): Int = {
    if (x == 0) y
    else if (x < 0)
      gcd(-x, y)
    else if (y < 0)
      -gcd(x, -y)
    else
      gcd(y % x, x)
  }
  private val g = gcd(n, d)
  val numer: Int = n/g
  val denom: Int = d/g
  def +(that: Rational) = new Rational(numer * that.denom + that.numer * denom, denom * that.denom)
  def -(that: Rational) = new Rational(numer * that.denom - that.numer * denom, denom * that.denom)
  def *(that: Rational) = new Rational(numer * that.numer, denom * that.denom)
  def /(that: Rational) = new Rational(numer * that.denom, denom * that.numer)
}

object Recursion extends App {{

  /**
    * Different ways to calculate the sum of a list using
    * recursive Scala methods.
    */


    val list = List.range(1, 100)
    println(sum(list))
    println(sum2(list))
    println(sum3(list))
   // println(sumWithReduce(list))

    // (1) yields a "java.lang.StackOverflowError" with large lists
    def sum(ints: List[Int]): Int = ints match {
      case Nil => 0
      case x :: tail => x + sum(tail)
    }

    // (2) tail-recursive solution
    def sum2(ints: List[Int]): Int = {
      @tailrec
      def sumAccumulator(ints: List[Int], accum: Int): Int = {
        ints match {
          case Nil => accum
          case x :: tail => sumAccumulator(tail, accum + x)
        }
      }
      sumAccumulator(ints, 0)
    }

    // (3) good descriptions of recursion here:
    // stackoverflow.com/questions/12496959/summing-values-in-a-list
    // this example is from that page:
    def sum3(xs: List[Int]): Int = {
      if (xs.isEmpty) 0
      else xs.head + sum3(xs.tail)
    }

  }

}
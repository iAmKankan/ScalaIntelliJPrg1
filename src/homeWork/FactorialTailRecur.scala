package homeWork

import scala.annotation.tailrec

/**
  * Created by hadoop on 4/2/17.
  */
object FactorialTailRecur {
  @tailrec
  def factorial(accumulator: Int, number: Int) : Int = {
    if(number == 1)
      return accumulator
     //println( number+" "+accumulator)
    factorial(number * accumulator, number - 1)
   }

  def main(args: Array[String]): Unit = {
    println(factorial(1,4))
  }

}

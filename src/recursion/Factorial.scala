package recursion

/**
  * Created by hadoop on 19/1/17.
  */
object Factorial {
  def factorial(i: Int): Long = {
    def fact(i: Int, accumulator: Int): Long = {
      if (i <= 1) accumulator
      else fact(i - 1, i * accumulator)
    }
    fact(i, 1)
  }

  def main(args: Array[String]): Unit = {

    (0 to 5) foreach (i => println(factorial(i)))
  }

}

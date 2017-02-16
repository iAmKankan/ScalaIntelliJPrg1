package recursion

/**
  * Created by hadoop on 3/12/16.
  */
object FactTailRecur {
  def factorial(accumulator: Int, number: Int) : Int = {
    if(number == 1)
      return accumulator;
    println(accumulator+"--"+number);
    return factorial(number * accumulator, number - 1);
  }
  def main(args: Array[String]): Unit = {
    println("The Result is: "+factorial(1,5));

  }

}

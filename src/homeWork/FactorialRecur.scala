package homeWork

/**
  * Created by hadoop on 4/2/17.
  */
object FactorialRecur {
  def fact(x:Int):Int={
    if(x==1) return 1;
    return x * fact(x-1);
  }
  def main(args: Array[String]): Unit = {

   print(fact(5));
  }

}

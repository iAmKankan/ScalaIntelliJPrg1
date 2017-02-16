package homeWork

/**
  * Created by hadoop on 4/2/17.
  */
object Factorial {
  def fact (x:Int): Int ={
    var result :Int=1;
    var n=x;
    while(n>0){
      result = result * n;
      n=n-1
    }
    result;
  }

  def main(args: Array[String]): Unit = {
    print(fact(5));
  }

}

package recursion

/**
  * Created by hadoop on 8/12/16.
  */
object ArrayMax {
  def recursiveMax (arr:Array[Int], n:Int): Int= {
    println("Hello World "+n);
    if (n == 1){
      println("i am out ");
      return arr{0};}

    return max (recursiveMax (arr, n-1), arr(n - 1));
   // return max (arr{n - 1},recursiveMax (arr, n-1));

  }
  /* helper function to compute max of two decimal integers */
  def max (n:Int, m:Int): Int = {
    print("["+n+" ,"+m+"]")
    if (n > m) return n;
    return m;
  }
  def main(args: Array[String]): Unit = {
    val arr=Array[Int](1, 3, 5, 4, 7, 19, 6, 11, 10, 2);
    //val max:Int=recursiveMax(arr,10);
    //println("\n"+max);
    println(" = "+recursiveMax(arr,10));
  }

}

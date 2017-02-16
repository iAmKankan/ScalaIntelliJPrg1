package recursion

/**
  * Created by hadoop on 8/12/16.
  */
object SimpleArray {
  /*def fnc(arr:Array[Int],n:Int): Int ={
    if (n==0)return 0;
    println(arr+" "+n);
   // return fnc(arr,n-1);
    //print(return fnc(arr,n-1));
    return prntfnc(fnc(arr,n-1));
  }
  def prntfnc(n:Int): Int ={
    print(" "+n);
    return n;

  }*/

  def recursiveMax (arr:Array[Int], n:Int): Int= {
    if (n == 2) {
      println(" iam out ")
      return arr(0);
    }
    print(" " +arr(n-1))
    return max (recursiveMax (arr, n-1),arr(n-1));
    // return max (arr{n - 1},recursiveMax (arr, n-1));

  }
  /* helper function to compute max of two decimal integers */
  def max (n:Int,m:Int): Int = {
    print("["+n+" ,"+m+"]")
    if (n > m) return n;
    return m;
   }


  def main(args: Array[String]): Unit = {
    val arr= Array[Int](0,77,4,55,2);
    println(" = "+recursiveMax(arr,5));
  }

}

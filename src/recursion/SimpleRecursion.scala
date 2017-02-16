package recursion

/**
  * Created by hadoop on 8/12/16.
  */
object SimpleRecursion {
  def myRecursion(n:Int): Int ={
    print(" "+n);
    if(n==0) return 0;
   // println(" ")
    myRecursion(n-1);
    println(" ");
      // print(myRecursion(n-1));
   print(" "+n);
    return n;

  }
  def main(args: Array[String]): Unit = {
    myRecursion(6);
  }

}

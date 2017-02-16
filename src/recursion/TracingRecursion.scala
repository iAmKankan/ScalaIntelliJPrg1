package recursion

/**
  * Created by hadoop on 11/12/16.
  */
object TracingRecursion {
  def mystery(a:Int,b:Int): Int ={
    //val x=2;
    if (b == 0) return 4;
    if (b % 2 == 0) return mystery (a+a, b/2);
    return mystery (a+a, b/2)+a;
  }
  def main(args: Array[String]): Unit = {
     val i:Int =4;
    val j:Int = 5;

    print("mystery of "+i+" and "+j+" is:"+mystery (4, 5));

  }

}
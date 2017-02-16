package recursion

/**
  * Created by hadoop on 12/12/16.
  */
object Ankit {
  def fnc(n:Int):Int={
    if(n==0) return 0;
    //print(" "+n);

    //print(" "+n);

    return n+fnc(n-1);; //
  }
  def main(args: Array[String]): Unit = {
    println(fnc(6));

  }

}

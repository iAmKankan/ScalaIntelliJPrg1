package recursion

/**
  * Created by hadoop on 13/12/16.
  */
object TestRecursion {
  def fnc(n:Int):Int={
   var i:Int= 0;
    if(n==0) return i;
    i=i+n;
    println(i)
    fnc(n-2);
    return i;

  }

  def main(args: Array[String]): Unit = {
    print(fnc(6));
  }

}

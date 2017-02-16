package recursion

/**
  * Created by hadoop on 14/1/17.
  */
object SimpleREcursion2 {
  def fnc(x:Int):Int={
     if(x==0) return 0;
    println(x)
    fnc(x-1);
    return x;
  }
  def main(args: Array[String]): Unit = {
    fnc(5);
  }

}

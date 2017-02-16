package homeWork

/**
  * Created by hadoop on 4/2/17.
  */
object GCDrecursion {
  def gcd(x:Int,y:Int):Int={
    if(y!=0) return gcd(y,x%y);
    return x;
  }

  def main(args: Array[String]): Unit = {
    print(gcd(12,8));
  }

}

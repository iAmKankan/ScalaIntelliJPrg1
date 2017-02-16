package homeWork

/**
  * Created by hadoop on 4/2/17.
  */
object GCD {

  def gcd(x:Int,y:Int):Unit={
    var gcd1=0
    var i=1
    while( i <= x && i <= y)
    {
      // Checks if i is factor of both integers
      if(x%i==0 && y%i==0)
        gcd1 = i;
      i=i+1;
    }

    print(" "+x+" , " +y+" = "+gcd1);


  }

  def main(args: Array[String]): Unit = {
    gcd(12,8)
  }

}

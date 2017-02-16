package recursion

/**
  * Created by hadoop on 4/12/16.
  */
object FiboTailRecur {
  def fibonacci(n:Int,a:Long,b:Long):Long={

    /*if(n==0) return b;
    if(n<2) return 1;
    return fibonacci(a+b,a,n-1);*/
    //return n==0 ? b: fibonacci(n-1,a+b,b);
    //return n == 0 ? b : fibonacci(n-1, a+b, a);
    if (n==0) return b;
    return fibonacci(n-1,a+b,a);
  }
  def main(args: Array[String]): Unit = {
    //FiboTailRecur obj=new FiboTailRecur();
    print(fibonacci(2,1,0));

  }

}

package recursion

/**
  * Created by hadoop on 9/3/17.
  */
object FiboScalaStyle {
  def fibo(n:Int):Int={
    def fibonacci(i:Int,a:Int,b:Int):Int=
      if(i==n) a else fibonacci(i+1,b,a+b)
    fibonacci(0,0,1)
  }
  def main(args: Array[String]): Unit = {
    println(fibo(7))
  }

}

package Functions

/**
  * Created by hadoop on 14/3/17.
  */
object HigherOrder_MO {
  def sumInt(a:Int,b:Int):Int={
    if(a>b) 0
    else a+sumInt(a+1,b)
  }
  def cube(x:Int):Int=x*x*x
  def sumCube(a:Int,b:Int):Int={
    if(a>b) 0
    else cube(a)+sumCube(a+1,b)
  }

  def main(args: Array[String]): Unit = {
    println(sumInt(3,7));
    println(cube(5));
    println(sumCube(1,4))
  }
}

package recursion

/**
  * Created by hadoop on 14/1/17.
  */
object azhar {
  def fn(a:Int,b:Int):Int={
    if(a==1) return b;

    return b+fn(a-1,b);
  }
  def main(args: Array[String]): Unit = {
    print(fn(2,6));
  }

}

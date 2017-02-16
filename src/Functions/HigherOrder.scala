package Functions

/**
  * Created by hadoop on 18/1/17.
  */
object HigherOrder {
  def perform(f:(Int,Int)=>Int): Unit ={
      print(f(12,10));
    //print(f.apply(12,6));
  }
  def main(args: Array[String]): Unit = {
     perform((x:Int,y:Int)=>x*y)


  }

}

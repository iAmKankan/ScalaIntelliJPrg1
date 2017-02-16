package recursion

/**
  * Created by hadoop on 10/12/16.
  */
object ArrayReverseRecur {
  def fnc(arr:Array[Int],n:Int): Int ={
    val i:Int=0;
   // val arr2:Array[Int](n);
    if(n==0) return 0;
    print("Array["+n+"]= "+arr(n-1)+" ");
    return fnc(arr,n-1);


  }
  def main(args: Array[String]): Unit = {
    val arr2=Array(1,4,6,8,1,2);
    fnc(arr2,6);
    //print(fnc(arr2));

  }

}

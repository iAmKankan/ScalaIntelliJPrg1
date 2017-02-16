package Class

/**
  * Created by hadoop on 16/1/17.
  */
class Abc(s:String,i:Int,y:String){
  def this(){
    this(" ",0," ");
  }
  def this(x:String){
    this(x,0,"");
  }
  def this(x:String,y:String ){
    this(x,0,y);
  }
  def this(x:String,i:Int){
    this(x,i," ");
  }
  def this(i:Int){
    this(" ",i," ");
  }
  def show(): Unit ={
    println("The value of 1:"+s)
    println("The value of 2:"+i)
    println("The value of 3:"+y)
  }
}
object Constructor1 {
  def main(args: Array[String]): Unit = {

    var obj1 = new Abc();
    var obj2 = new Abc("Hello");
    var obj3 = new Abc("Hello", 66);
    val obj4 =new Abc(4)


    obj1.show();
    obj2.show();
    obj3.show();
    obj4.show();
  }
}

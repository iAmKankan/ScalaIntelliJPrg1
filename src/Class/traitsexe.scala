package Class

/**
  * Created by hadoop on 16/1/17.
  */
trait A{
  var x:Int        //abstract feild
  val y:Int=420    //concreate field
  def show1()
  def show3(): Unit ={
    print("this is show3")
  }

}
trait B {
  def show2()

}
class C extends A with B{
  var x=786
  def show1: Unit ={
    println("this is show1")
  }

  def show2(): Unit ={
    println("this is show2")
  }

  override def show3(){
     println("this is override show 3")
   }

}
object traitsexe {
  def main(args: Array[String]): Unit = {

    var obj = new C
    obj.show1
    obj.show2()
    obj.show3()
    println(obj.y)
  }
}
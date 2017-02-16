package Class

/**
  * Created by hadoop on 16/1/17.
  */
trait First{
  def show(): Unit ={
    println("i am from First");
  }
}
trait Second extends First{
  override def show(): Unit = {
    println("i am from Second")
  }
}
trait Third extends First{
  override def show(): Unit = {
    println("i am from Third")
  }
}
class Forth extends Third with Second  {
  override def show(): Unit = super.show()

}
object MultipleInheritence {
  def main(args: Array[String]): Unit = {

    val obj = new Forth()
    obj.show()
  }
}

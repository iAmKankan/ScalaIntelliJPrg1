package syntactic_sugar

/**
  * Created by hadoop on 16/12/16.
  */
object Foo1 {
  def foo(i:Int):Unit =
  foo{
    println("hi")
    7
  }

  def main(args: Array[String]): Unit = {
    foo(6);
  }

}

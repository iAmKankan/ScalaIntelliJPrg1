/**
  * Created by hadoop on 8/11/16.
  */
object HelloWorld {
  def main(args: Array[String]): Unit = {
    delayed(time());
  }

  def time() = {
    println("Getting time in nano seconds")
    System.nanoTime
  }
  def delayed( t: => Long ) = {
    println("In delayed method")
    println("Param: " + t)
  }

}

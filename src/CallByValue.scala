/**
  * Created by hadoop on 8/11/16.
  */
object CallByValue extends App {

  def time(): Long = {
    println("In time()")
    System.nanoTime
  }

  def exec(t: Long): Long = {
    println("Entered exec, calling t ...")
    println("t = " + t)
     t            //  we are returning t
  }

  println(exec(time()))

}
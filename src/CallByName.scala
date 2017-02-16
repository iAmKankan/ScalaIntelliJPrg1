/**
  * Created by hadoop on 8/11/16.
  */

object CallByName extends App {

  def time() = {
    println("Entered time() ...")
    System.nanoTime
  }

  // uses a by-name parameter here
  def exec(t: => Long) = {
    println("Entered exec, calling t ...")
    println("t = " + t)                 //the time() function is calling  for every appearance of the parameter
    println("Calling t again ...")
    t                                   //the time() function is calling for every appearance of the parameter 't'
  }

  println(exec(time()))

}
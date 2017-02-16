package Functions

/**
  * Created by hadoop on 4/2/17.
  */
object CurringFunction {
  def curry(a:Int)(b:Int)(s:String):String={
    return (" The output is : "+a+","+b+","+s+" ")

  }
  def main(args: Array[String]): Unit = {
    println(curry(1)(2)("wew"));
    println(curry(1)_)        //function
    //println(curry__("dsaada"))
  }

}

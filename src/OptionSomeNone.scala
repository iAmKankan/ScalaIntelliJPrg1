/**
  * Created by hadoop on 26/1/17.
  */
object OptionSomeNone {
  def toInt(in: String): Option[Any] = {
    try {
      Some(Integer.parseInt(in.trim))
    } catch {
      case e: Exception => None
    }
  }

  def main(args: Array[String]): Unit = {
    val bag = List("1", "2", "three", "4", "one hundred seventy five")
    val x= bag.flatMap(toInt)
   // println(toInt("oo"));
    println(x);

  }

}

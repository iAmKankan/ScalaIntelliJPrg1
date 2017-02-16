package PatternMatching

/**
  * Created by hadoop on 19/1/17.
  */
object ValVarTypeMatching2 {
  def main(args: Array[String]): Unit = {
    for {
      x <- Seq(1,3,2, 2.7, "one", "two", '%@&&#)
    } {
      //val four =" jjjj"
      val str = x match {
        case 1 => "int 1"
        case _: Int => "other int: "+x
        case _: Double => "a double: "+x
        case "one" => "string one"
        case _: String => "other string: "+x
        case _ => "unexpected value: " + x
      }
      println(str)
    }
  }

}

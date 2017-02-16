package PatternMatching

/**
  * Created by hadoop on 19/1/17.
  */
object ValVarTypeMatching1 {
  def main(args: Array[String]): Unit = {
     for {
      x <- Seq(1,3,2, 2.7, "one", "two", '%@&&#)
    } {
      //val four =" jjjj"
      val str = x match {
        case 1 => "int 1"
        case i: Int => "other int: "+i
        case d: Double => "a double: "+x
        case "one" => "string one"
        case s: String => "other string: "+s
        case unexpected => "unexpected value: " + unexpected
      }
      println(str)

    }
  }

}

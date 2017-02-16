package PatternMatching

/**
  * Created by hadoop on 20/1/17.
  */
object MatchVariables1 {
  def main(args: Array[String]): Unit = {
    for {
      x <- Seq(1, 2, 2.7, "one", "two", 'four)
    } {
      val str = x match {
        case _: Int | _: Double => "a number: " + x
        case "one" => "string one"
        case _: String => "other string: " + x
        case _ => "unexpected value: " + x
        // head +: tail => s"$head"
      }
      println(str)
    }
  }
}

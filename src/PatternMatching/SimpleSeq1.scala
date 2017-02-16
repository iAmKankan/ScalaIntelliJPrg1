package PatternMatching

/**
  * Created by hadoop on 19/1/17.
  */
object SimpleSeq1 {
  def main(args: Array[String]): Unit = {
    val bools = Seq(true, false)
    println("Head is: "+bools.head+" The tail is: "+bools.tail)
    for (bool <- bools) {
      bool match {
        case true => println("Got heads*")
        case false => println("Got tails*")
      }
      println("------alternative way------")
      val which = if (bool) "head" else "tails"
      println("Got " + which)
    }
  }

}

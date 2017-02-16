package PatternMatching

/**
  * Created by hadoop on 19/1/17.
  */
object SurpriseMatching1 {
  def checkY(y: Int) = {
    for {
      x <- Seq(99, 100, 101)
    } {
      val str = x match {
        case y => "found y! "+x
        case i: Int => "int: "+i
        //case head +: tail => s"$head +: "+checkY(tail)
      }
      println(str)

    }
  }

  def main(args: Array[String]): Unit = {
    checkY(100)
  }


}

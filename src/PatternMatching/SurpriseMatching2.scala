package PatternMatching

/**
  * Created by hadoop on 20/1/17.
  */
object SurpriseMatching2 {
  def checkY(y: Int) = {
    val p:Int=800
    for {
      x <- Seq(99, 100, 101,800)
    } {
      val str = x match {
        case `y` => "found y! "+y // The only change: `y`
        case `p` => "found p! "+p
        case i: Int => "int: "+i
      }
      println(str)
    }
  }

  def main(args: Array[String]): Unit = {
    checkY(100)
  }

}

/**
  * Created by hadoop on 24/11/16.
  */
object MatchCase {
  def main(args: Array[String]) {
    println("Hello, world!")
    val i = 5

    val month = i match {
      case 1 => "January"
      case 2 => "February"
      case 3 => "March"
      case 4 => "April"
      case 5 => "May"
      case 6 => "June"
      case 7 => "July"
      case 8 => "August"
      case 9 => "September"
      case 10 => "October"
      case 11 => "November"
      case 12 => "December"
      case _ => "Invalid month" // the default, catch-all
    }
    println(month)
  }
}

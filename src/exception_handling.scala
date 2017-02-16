/**
  * Created by hadoop on 25/1/17.
  */
object exception_handling {
  def main(args: Array[String]) {
    val x = 0
    val y = 24
    val s ="raza"
    try {
      val c = y / x

    } catch {
      case e: ArithmeticException =>{println("dividing by zero")}
    }
    try
    {
      val z = s * y
    }
    catch
      {
        case e: NumberFormatException =>{println("string and integer operation")}

      }

    finally {
      print("this is finally block")
    }


  }
}



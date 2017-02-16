package PatternMatching

/**
  * Created by hadoop on 19/1/17.
  */
object MixedMatching {
  def main(args: Array[String]): Unit = {
    val i=9
    println(matching(100))
    println(matching("Hi"))
    println(matching('C'))
    println(matching("three dot five"))
    println(matching(i))
  }
  def matching(x:Any):Any= x match{
    case "Hi" => "Gritting"
    case 100 =>  "Police"
    case 'C' => 100
    case "three dot five" => 3.5
    case y:Int  => "scala.Int"
    case _ => "default"
  }

}

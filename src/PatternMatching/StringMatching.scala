package PatternMatching

/**
  * Created by hadoop on 19/1/17.
  */
object StringMatching {
  def main(args: Array[String]): Unit = {
print(matching(" "));
  }
  def matching(x:String):String =  x match{
    case "arijit" => "S/W engineer"
    case "tausif" => "S/W engineer"
    case "raja" => "Doctor"
    case "amit" => "Hero"
    case _ => "Pilot"

  }

}

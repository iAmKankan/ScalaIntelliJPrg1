/**
  * Created by hadoop on 9/11/16.
  */
/*class Person {

}*/
class Person() {
  // Private age variable, renamed to _age
  private var _age = 0
  var name = ""

  // Getter
  def age = _age

  // Setter
  def age_= (value:Int):Unit = _age = value*2
}
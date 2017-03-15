package homeWork

/**
  * Created by hadoop on 15/3/17.
  */
class Employee(name:String,age:Int,sal:Double,add:String){


  override def toString: String = "Name "+name+" Age "+age+" Salary "+sal+" Address "+add
}

object EmployeeZica {
  def main(args: Array[String]): Unit = {
    val e1=new Employee("Arijit",25,70000.0,"mallikpur")
    val e2=new Employee("Ankith",30,90000.0,"merath")
    val list:List[Any]=List(e1,e2);
    //println(e1)
    list.foreach(x=>println(x))
  }

}

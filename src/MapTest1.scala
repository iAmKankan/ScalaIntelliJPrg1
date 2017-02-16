/**
  * Created by hadoop on 3/12/16.
  */
object MapTest1 {
  def main(args: Array[String]): Unit = {

    val employees = Map("Manager" -> "Bob Smith", "Secretary" -> "Sue Brown","Manager" -> "John White", "Secretary" -> "David Willy")

    // Get value using the key after checking that it exists
    /*if(employees.contains("Manager"))
      printf("Manager : %s\n", employees("Manager"))*/
    for ((k,v)<-employees if employees.contains("Manager"))
          printf("Manager : %s\n", employees("Manager"))
  }

}

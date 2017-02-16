/**
  * Created by hadoop on 12/1/17.
  */
object ArrayMulti {
  def main(args: Array[String]): Unit = {
    var multTable = Array.ofDim[Int](10,10)

    for(i <- 0 to 9) {
      for (j <- 0 to 9) {
        multTable(i)(j) = i + j
      }
    }
    for(i <- 0 to 9){
      for(j <- 0 to 9){
       // printf("%d : %d = %d\n", i, j, multTable(i)(j))
       // print(multTable(i)(j) +" ");
        //println(f"$i : $j = ${multTable(i)(j)}")

        println("" +i +" :: "+j +"="+multTable(i)(j))

      }
      println( " ");
    }
  }

}

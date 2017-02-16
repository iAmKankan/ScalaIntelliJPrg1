/**
  * Created by hadoop on 23/11/16.
  */
object Loop1 {

 def main(args: Array[String]): Unit = {
   val randLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

   /*for (i <- 0 until randLetters.length){

     // Get the letter in the index of the String
     println(randLetters(i) + " At ["+i+"]")
   }
   println(" "+randLetters.length)*/
   /*for ( i: Char <- randLetters){
     print(i+" ")
   }*/
   /*var x = 0

   for (i <- 1 to 5) yield i

   while (x <= 10) yield x*/
   //for (i <- 5 to 10) yield for(j<-1 to 5) yield i*j

   for(i<-5 to 10;j<- 1 to 5) print(i*j + " ")
   for(i<-5 to 10;j<- 1 to 5) yield i*j


 }
}

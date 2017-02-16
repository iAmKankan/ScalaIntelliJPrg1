/**
 * Created by hadoop on 24/11/16.
 */
public class JavaRecursion {

    /*int fact(int n){
        int i=0;
        if(n ==1)
            return 2;

        i=fact(n-1)*n;

        return i;
    }*/

   /*void fibonacci(int n)
    {
        int i=0;//,prev,next;
         if(n>=1)
         {
            fibonacci(n - 1);
           System.out.println("[ "+n+"]");
             if(n<=2)
                 System.out.print(" "+1);
             else
                 System.out.print(" "+((n-1)+(n-2)));
         }





    }*/

  void series1to5 (int n)
    {

        if(n>1)
            series1to5(n-1);
        System.out.println(n);
    }
    /*void series5to1 (int n)
    {
        System.out.println(n);
        if(n>1)
            series5to1(n-1);
    }*/


    public static void main(String[]args){

        JavaRecursion obj1=new JavaRecursion();
        //obj1.HelloWorld(7);
      // System.out.println( obj1.fact(5));
        //obj1.series2(5);
       //obj1.fibonacci(5);
        //fibonacci(5);
        obj1.series1to5(5);

    }
}

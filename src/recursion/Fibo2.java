package recursion;

/**
 * Created by hadoop on 27/11/16.
 */
public class Fibo2 {

    public static void main(String[] args) {
        /*int index = 0;
        int j=5;*/
       /* while (j>0) {
            System.out.println(fibonacci(index)+"="+index);
            index++;
            j--;
        }*/
        System.out.println(fibonacci(4));
    }

    public static long fibonacci(int i) {
       // System.out.println("Method "+i);
        if (i == 0) return 0;
        if (i < 2) return 1;

       /*long fibTerm = fibonacci(i - 1) ;//+ fibonacci(i - 2);
       long fibTerm2= fibonacci(i - 2);*/
       // return fibTerm+fibTerm2;
       // return fibTerm2+fibTerm;
        //return fibTerm;
       // return i+fibonacci(i - 2);
        return fibonacci(i-1) +fibonacci(i-2);

    }
}
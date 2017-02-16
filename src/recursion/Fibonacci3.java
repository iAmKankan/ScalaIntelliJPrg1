package recursion;

/**
 * Created by hadoop on 27/11/16.
 */
public class Fibonacci3 {
    public static long fibo(int n){
        if(n==0) return 0;
        if(n<2) return 1;
        return   fibo(n-1)+fibo(n-2);
    }
    public static void main(String[] args) {
        int index=0;
        while(true){
            System.out.println(fibo(index++));
        }

    }
}

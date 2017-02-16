package recursion;

/**
 * Created by hadoop on 27/11/16.
 */
public class FactorialRecursion {
    int fact(int n)
    {
       // int j,i=2;
        if(n==1)
            return 1;
        //j=i+fact(n-1);
        return (n+fact(n-1));
    }
    public static void main(String[] args) {

        System.out.println(new FactorialRecursion().fact(6));
    }
}

/**
 * Created by hadoop on 1/3/17.
 */
class C{
    C(){
        System.out.println("From C");
    }
    static {System.out.println("hello C");}
}
class A extends C{
    A(){
        System.out.println("From A");
    }
    static {System.out.println("helllooooooooooo");}
}
class B extends A{
    B(){
       //super();
        System.out.println("From B");
    }

}
public class SuperClass {
    public static void main(String[]args){
        B b=new B();
        //b.c();
    }
}

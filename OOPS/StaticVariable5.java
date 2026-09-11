package OOPS;

public class StaticVariable5 {
    static int a = 10; // static variable
    int b = 20; // non-static variable

    static void m1() { // static method
        System.out.println("m1: This is static method");
    }

    void m2() { // non static method
        System.out.println("m2: This is simple method");
    }

    void m() {
        System.out.println(a);
        System.out.println(b);
        m1();
        m2();
    }

    public static void main(String[] args) {

        // System.out.println(b); //can not access directly without object
        // System.out.println( m2());
        StaticVariable5 sv = new StaticVariable5();
        System.out.println(sv.b); // access using object
        sv.m2();

        

        System.out.println("Statis variable: ");
        System.out.println(a);
        System.out.println("--------------");
        //System.out.println("Non Static variable: ");
        m1();

        sv.m();
    }

}

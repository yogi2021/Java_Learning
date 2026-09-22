package OOPS;

// Method Overloading

public class Polymorphism1 {

    int a = 10, b = 20;

    // No parameter
    void sum() {
        System.out.println(a + b);
    }

    // Two int parameters
    void sum(int x, int y) {
        System.out.println(x + y);
    }

    // int and double
    void sum(int x, double y) {
        System.out.println(x + y);
    }

    // double and int
    void sum(double x, int y) {
        System.out.println(x + y);
    }

    // Three int parameters
    void sum(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    // Main method
    public static void main(String[] args) {

        Polymorphism1 p1 = new Polymorphism1();

        p1.sum();
        p1.sum(100, 200);
        p1.sum(23, 345);
        p1.sum(1000, 10.5);
        p1.sum(5, 5, 5);
    }
}
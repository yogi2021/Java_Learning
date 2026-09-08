package OOPS;

public class DefaultConstructor2 {

    String name;
    int age;

    // Constructor
    DefaultConstructor2(){
        name = "Yogii";
        age = 21;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {

       DefaultConstructor2 obj = new DefaultConstructor2();

        obj.display();
    }
}
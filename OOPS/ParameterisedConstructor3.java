package OOPS;

public class ParameterisedConstructor3{

    String name;
    int age;
    String course;

    // Parameterized Constructor
    ParameterisedConstructor3(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
        System.out.println("------------------");
    }

    public static void main(String[] args) {

        ParameterisedConstructor3 s1 = new ParameterisedConstructor3("Yogii", 21, "Java");
       ParameterisedConstructor3 s2 = new ParameterisedConstructor3("Nikhil", 28, "Testing");

        s1.display();
        s2.display();
    }
}
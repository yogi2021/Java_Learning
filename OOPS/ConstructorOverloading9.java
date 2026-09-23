package OOPS;

public class ConstructorOverloading9 {

    // Constructor Overloading
    // Same constructor name but different parameters

    double width, height, depth;

    // Default / No-argument constructor
    ConstructorOverloading9() {
        width = height = depth = 0;
    }

    // Parameterized constructor - 3 parameters
    ConstructorOverloading9(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // Parameterized constructor - 1 parameter
    ConstructorOverloading9(double len) {
        width = height = depth = len;
    }

    // Method to calculate volume
    double volume() {
        return width * height * depth;
    }

    public static void main(String[] args) {

        ConstructorOverloading9 C1 = new ConstructorOverloading9();
        ConstructorOverloading9 C2 = new ConstructorOverloading9(10.5, 15.5, 10);
        ConstructorOverloading9 C3 = new ConstructorOverloading9(2.5);

        System.out.println("C1 Volume = " + C1.volume());
        System.out.println("C2 Volume = " + C2.volume());
        System.out.println("C3 Volume = " + C3.volume());
    }
}
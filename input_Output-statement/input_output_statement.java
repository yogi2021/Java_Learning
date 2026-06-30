import java.util.*;

public class input_output_statement {
    public static void main(String[] args) {
        // output
        System.out.print("Hello world");
        System.out.print("Hello world \n"); // next line
        System.out.println("Hello world");// for new line

        // input
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine(); // string
        System.out.println(name);

        // variables in java
        int a = 20;

        System.out.println(a);

        // take 2 variables from user and print their sum
        int y = sc.nextInt();
        int z = sc.nextInt();
        int p = y + z;
        System.out.println(p);

        sc.close();
    }
}

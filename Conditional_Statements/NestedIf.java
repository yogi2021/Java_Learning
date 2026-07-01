import java.util.Scanner;

public class NestedIf {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        System.out.print("Has Driving License? (true/false): ");
        boolean license = sc.nextBoolean();

        if(age >= 18){
            if(license){
                System.out.println("Eligible to Drive");
            }
            else{
                System.out.println("Get Driving License First");
            }
        }
        else{
            System.out.println("Not Eligible");
        }

        sc.close();
    }
}
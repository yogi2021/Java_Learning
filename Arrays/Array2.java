 package Arrays;
 import java.util.Scanner;
 
public class Array2 {

	void accept (int arr[]) {
		Scanner sc= new Scanner (System.in);
		for(int i=0; i<arr.length; i++) {
			System.out.println("Enter element :");
			arr[i]=sc.nextInt();
		}
	}
	
	void display(int a[]) {
		for (int i=0; i<a.length;i++) {
			System.out.println(a[i]);
		}
	}


public static void main(String args[]) {
	int num[]= new int[5];
	
	Array2 aa= new Array2 ();
	aa.accept(num);
	aa.display(num);
  }
}
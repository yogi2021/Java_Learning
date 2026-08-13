 package Arrays;
 import java.util.Scanner;
 
public class Array6 {

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
	
	void reverseArray(int arr[]) { 
		for (int i = arr.length-1; i>=0; i--) {
			System.out.println(arr[i]);
		}
	}


public static void main(String args[]) {
	int num[]= new int[5];
	
	Array6 aa= new Array6 ();
	aa.accept(num);
	aa.display(num);
	System.out.println("======================");
	aa.reverseArray(num);
  }
}
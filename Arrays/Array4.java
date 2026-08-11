 package Arrays;
	 import java.util.Scanner;

// wap a program display odd no. using array
	 
	public class Array4 {

		void accept (int arr[]) {
			Scanner sc= new Scanner (System.in);
			for(int i=0; i<arr.length; i++) {
				System.out.println("Enter element :");
				arr[i]=sc.nextInt();
			}
		}
		
		void display(int arr[]) {
			for (int i=0; i<arr.length;i++) {
				if(arr[i]%2!=0) {
				System.out.println(arr[i]);
			}
		}}


	public static void main(String args[]) {
		int num[]= new int[5];
		
		Array4 aa= new Array4 ();
		aa.accept(num);
		aa.display(num);
	  }
	}


package Arrays;

import java.util.Scanner;

//array which divisible by 3

public class Array5 {


		void accept (int arr[]) {
			Scanner sc= new Scanner (System.in);
			for(int i=0; i<arr.length; i++) {
				System.out.println("Enter element :");
				arr[i]=sc.nextInt();
			}
		}
		
		void display(int arr[]) {
			for (int i=0; i<arr.length;i++) {
				if(arr[i]%3==0) {
				System.out.println(arr[i]);
			}
		}}


	public static void main(String args[]) {
		int num[]= new int[5];
		
		Array5 aa= new Array5();
		aa.accept(num);
		aa.display(num);
	  }
	}




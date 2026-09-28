package JavaPractice;

// 1. Find Largest number

import java.util.Scanner;

public class Practice1 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Eneter First Number: ");
	int num1 = sc.nextInt();
	System.out.println("Eneter Second Number: ");
	int num2 = sc.nextInt();
	System.out.println("Eneter Third Number: ");
	int num3 = sc.nextInt();
	
	if(num1>=num2 && num1>=num3) {
		System.out.println(num1);
	}else if(num2>=num1 && num2>=num3){
		System.out.println(num2);
	}else {
		System.out.println(num3);
	}
}
}
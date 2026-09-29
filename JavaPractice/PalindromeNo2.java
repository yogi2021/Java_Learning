package JavaPractice;
import java.util.Scanner;

public class PalindromeNo2 {
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number: ");
	int num = sc.nextInt();
	
	int OriginalNo = num;
	int rev=0;
	while(num>0) {
		int digit = num % 10;
		rev = rev* 10 + digit;
		num = num/10;	
	}
	if(OriginalNo==rev) {
		System.out.println("Palindrome");
	}else {
		System.out.println("Not Palindrome");
	}
}
}

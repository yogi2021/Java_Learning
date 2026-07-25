package Methods;
import java.util.Scanner;
//Palindrome matlab koi number ya word ulta aur seedha dono same ho.
public class PalindromeNo {
	void checkPalindrome(int n) {
		int OriginalNo=n;
		int reverseNo=0;
		while(n>0) {
			int last_Digit=n % 10;
			 reverseNo = reverseNo*10 + last_Digit;
			 n=n/10;
				
		}
		
		if(OriginalNo==reverseNo) {
			System.out.println("palindrome no");
		}else {
			System.out.println("Not palindrome");
		}
	}
	
public static void main(String[] args) {
	PalindromeNo r = new PalindromeNo();
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number:");
	int n = sc.nextInt();
	r.checkPalindrome(n);
	sc.close();
}
}

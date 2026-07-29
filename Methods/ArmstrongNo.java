package Methods;
import java.util.Scanner;
//Armstrong Number
// Armstrong no. is equal to sum of digit, where each digit raise to power of count of digit
public class ArmstrongNo {
	int countDigit(int n) {
         int count = 0;
    	
    	while(n > 0){
    		count++;
    		n = n /10;
    	}
    	return count;
	}
	
	void  isArmstrong(int n) {
		int temp = n;
		int power = countDigit(n);
		int sum= 0;
		while(n>0) {
			int base = n%10;
			sum= sum + calpow(base,power);
			n=n/10;
		}
		if(sum==temp) {
			System.out.println("Number is Armstrong");
		}else {
			System.out.println("Number is not Armstrong");
		}
	}
	
	int calpow(int base, int power) {
		int pro=1;
		for(int i=1; i<=power; i++) {
			pro=pro*base;
		}
		return pro;
	}
	  
public static void main(String[] args) {
	ArmstrongNo a =new ArmstrongNo();
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number:");
	int n = sc.nextInt();
	a.isArmstrong(n);

	sc.close();
}
}
 
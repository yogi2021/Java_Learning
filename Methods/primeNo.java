package Methods;
import java.util.Scanner;
// wap which display all prime no. between n given no.
public class primeNo {
	boolean isPrime(int n){
	
		
		if(n <=1) {
			return false;
		}
		
		for(int i=2; i<=n/2 ; i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
public static void main(String[] args) {
	primeNo P = new primeNo();
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter a number:");
	int n = sc.nextInt();
	
	
	for(int i=2; i<=n; i++) {
		if(P.isPrime(i)) {
			System.out.println(i+" ");
		}
	}
	sc.close();
}
}

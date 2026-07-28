package Methods;
// wap wich have method calpow(int base, int power) take 2 no. as parameter one is base and another power
import java.util.Scanner;
public class CalcPower {
	int calPower(int base, int pow){
		int pro=1;
		for(int i = 1; i<=pow; i++) {
			pro=pro*base;
		}
		return pro;
	}
 public static void main(String[] args) {
	 CalcPower c = new CalcPower();
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter a base : ");
	 int base = sc.nextInt();
	 System.out.println("Enter a power : ");
	 int pow = sc.nextInt();
	 
	 int result = c.calPower(base, pow);
	 System.out.println(result);
}
}

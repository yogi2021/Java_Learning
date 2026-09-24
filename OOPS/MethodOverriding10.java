package OOPS;

public class MethodOverriding10 {
	
	class Bank{
		double roi() {
			return 0;
		}
	}
	
	class ICICI extends Bank{
		double roi() {
			return 10.5;
			
		}
	}
	
	class SBI extends Bank{
		double roi() {
			return 11.5;
		}
	}
	
 public static void main(String[] args) {
	MethodOverriding10 m = new MethodOverriding10();
	ICICI ic = m.new ICICI();
	System.out.println(ic.roi());
}
}

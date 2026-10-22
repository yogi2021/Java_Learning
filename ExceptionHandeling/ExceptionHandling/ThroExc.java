package ExceptionHandling;

public class ThroExc {
	static void m1() throws NullPointerException{
		String str = null;
		System.out.println(str.length());
	}
	static void m2() throws NullPointerException{
		m1();
		
	}

}

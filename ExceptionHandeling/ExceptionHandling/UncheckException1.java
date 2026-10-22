package ExceptionHandling;

public class UncheckException1 {
 public static void main(String[] args) {
	System.out.println("Hello");
	try {
		int num=10/0;
	}catch(ArithmeticException e) {
		System.out.println(e.getMessage());
		System.out.println(e.getClass());
		e.printStackTrace();
	}finally {
		System.out.println("end");
	}
	System.out.println("Bye !");
}
}
 
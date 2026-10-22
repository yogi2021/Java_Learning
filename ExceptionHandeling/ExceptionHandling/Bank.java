package ExceptionHandling;

public class Bank {
   static void withdraw(int balence) throws MinimumBalenceException{
	   if(balence<1000) {
		   throw new MinimumBalenceException("Minimum balence should be 1000");
	   }
	     System.out.println("Withdrawal Successful");
   }
   public static void main(String[] args) {
	try {
		withdraw(500);
	} catch(MinimumBalenceException e) {
		System.out.println(e.getMessage());
	}
}
}

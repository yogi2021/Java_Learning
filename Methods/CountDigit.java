package Methods;
   import java.util.Scanner;
 // Wap which have method countDigit() take some number from user and return count digit
    public class CountDigit{
   int countDigit1(int num) {
    	int count = 0;
    	
    	while(num > 0){
    		count++;
    		num = num /10;
    	}
    	return count;
    }
    
     public static void main(String[] args) {	
    	 
    	 CountDigit c = new CountDigit();
    	 Scanner sc = new Scanner(System.in);
    	 
     System.out.println("Enter a number:");
     int num = sc.nextInt();
     
     int result = c.countDigit1(num);
     System.out.println("no.of Digit= "+ result);
     sc.close();
}
}
    
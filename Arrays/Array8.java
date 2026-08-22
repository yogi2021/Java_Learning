//wap which  display prime no it

package Arrays;
import java.util.Scanner;



//static methods calls directly class through, no need of object---public static
public class Array8 {
	
	//check prime
	public static void checkprime(int n) {
		 int count=0;
		 
		 for(int i=1; i<=n; i++) {
			 if(n%i==0) {
				 count++;
			 }
		 }
		 if(count==2) {
			 System.out.println(n);
		 }
	 }
	
	 // Accept array elements
    void accept(int arr[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 5 Elements:");

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter Element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
    }
	
	//display
       void display(int[]arr) {
    	  for(int i=0; i<arr.length;i++) {
    		  System.out.println(arr[i]);
    	  }
      }
      
      
      
  	//main method
  	public static void main(String[] args) {
  		
  		Array8 aa = new Array8();
  		int arr[]=new int[5];
  		
  		aa.accept(arr);
  		aa.display(arr);
  	
  	  System.out.println("Prime Numbers:");

      for(int i = 0; i < arr.length; i++) {
          checkprime(arr[i]);
  	}
}}
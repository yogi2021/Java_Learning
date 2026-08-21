package Arrays;
import java.util.Scanner;



//static methods calls directly class through, no need of object---public static
public class Array7 {
	
	//main method
	public static void main(String[] args) {
		int arr[]=new int[5];
		accept(arr);
		display(arr);
		sumofElements(arr);
	}
	
	//accept
	public static void accept(int[]arr) {
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<arr.length; i++) {
			System.out.println("Enter Element: ");
			arr[i]=sc.nextInt();
		}
	}
	
	//display
      public static void display(int[]arr) {
    	  for(int i=0; i<arr.length;i++) {
    		  System.out.println(arr[i]);
    	  }
      }
      
      //sum
      public static void sumofElements(int []arr) {
    	  int sum=0;
    	  for(int i=0; i<arr.length;i++) {
    		  sum=sum+arr[i];
    	  }
    	  System.out.println("Sum of element in array: "+ sum);
      }
}

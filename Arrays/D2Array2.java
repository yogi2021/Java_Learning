package Arrays;
import java.util.Scanner;

public class D2Array2 {
  public static void main(String[] args) {
	
	  int arr[][] = new int [2][3];
		accept(arr);
		display(arr);
}
	  public static void accept(int [][] arr) {
		  Scanner sc  = new Scanner (System.in);
		  for(int row=0; row<arr.length; row++) {
			  for(int col=0; col<arr[row].length; col++) {
				  System.out.println("Enter Number : ");
				  arr[row][col]= sc.nextInt();
			  }
		  }
	  }
	  
	  static void display (int[][] a) {
      	
      	for (int i =0; i< a.length; i++) {
      		for(int j=0; j<a[i].length; j++) {
      			System.out.print(a[i][j]+ " ");
      		}
      		System.out.println();
      	}
      
      }
}

package Arrays;
import java.util.Scanner;

// sum of 2 dimensional array index and their average

public class D2Array3 {
  public static void main(String[] args) {
	
	  int arr[][] = new int [2][3];
		accept(arr);
		display(arr);
		findmaxelement(arr);
		displayEven(arr);
		sumofelement(arr);
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
	  
	  static void sumofelement(int [][] arr) {
		  int sum=0;
		  double avg=0;
		 int count=0;
		  for(int row=0; row<arr.length; row++) {
			  for(int col=0; col<arr[row].length; col++) {
				  sum = sum+arr[row][col];
				  count++;
			  }
		   }

           //		  avg = sum /count;
		  System.out.println("avg =>" + avg );
	  }
	  
	// WAP to find biggest element from 2D array
	  static void findmaxelement(int[][] arr) {

	      int max = arr[0][0];   // Assume first element is maximum

	      for (int i = 0; i < arr.length; i++) { 
	          for (int j = 0; j < arr[i].length; j++) {

	              if (arr[i][j] > max) {
	                  max = arr[i][j];
	              }

	          }
	      }

	      System.out.println("Maximum Element = " + max);
	  }
		  
	  //wap which display even numbers from array
	  static void displayEven(int [][] arr) {
		  for(int i =0; i<arr.length; i++) {
			  for(int j=0; j<arr[i].length;j++) {
				  if(arr[i][j]%2==0) {
					  System.out.print(arr[i][j]+" ");
				  }
			  }
			      System.out.println();
              }
	  }

	  
	
	  
}

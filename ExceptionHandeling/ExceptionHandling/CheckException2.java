package com.ExceptionHandling;

public class CheckException2 {
  
	public static void CheckException() {
	int arr[] = {12, 45, 63};
  try {
	  int num=arr[1]/0;
	  System.out.println(arr[5]);
  }catch(ArrayIndexOutOfBoundsException e) {
	  e.printStackTrace();
  }catch(ArithmeticException e) {
	  e.printStackTrace();
  }
    System.out.println("End !");
}
	public static void main(String[] args) {
		CheckException();
	}
}
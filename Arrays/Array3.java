package Arrays;
import java.util.Scanner;
   
// Wap which create String array. take the input from user and display it

public class Array3 {
	void get(String arr[]) {
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<arr.length; i++) {
			System.out.println("Enter a Charecter");
			arr[i]= sc.next();
		}
	}
	
	void display(String a[]) {
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
	}

public static void main(String[] args) {
	
	String value[] = new String[5];
	
	Array3 aa = new Array3();
	
	aa.get(value);
	aa.display(value);
	
  }
}

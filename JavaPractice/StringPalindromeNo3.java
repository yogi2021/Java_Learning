package JavaPractice;

import java.util.*;

//Check Palindrome Number of String

public class StringPalindromeNo3 {
	
public static void main(String[] args) {
        
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter A word : ");
	        String word = sc.next();
	        
	        String rev="";
	        
	        for(int i =word.length()-1; i>=0; i--){
	                rev = rev +word.charAt(i);
	            
	        }
	        
	         if(word.equals(rev)){
	                System.out.println("Yes");
	             }else{
	                System.out.println("No");
	             }
	    
}
}

package com.ExceptionHandling;

public class Voting {
    static void checkAge(int age) throws InvalidAgeException{
    	if(age<18) {
    		throw new InvalidAgeException ("Age must be 18 or above");
    	}
    	System.out.println("You can vote");
    }
    
    public static void main(String[] args) {
		try {
			checkAge(14);
		}catch(InvalidAgeException e) {
			System.out.println(e.getMessage());
		}
	}
}

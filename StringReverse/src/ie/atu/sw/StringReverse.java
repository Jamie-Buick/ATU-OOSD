package ie.atu.sw;

import java.util.*;


public class StringReverse {
	
	private Scanner s;

	
	
	
	public StringReverse() {
		s = new Scanner(System.in);
	}

	public void getInput() {
		
		//Get a string from the user 
		System.out.println("Please enter the string you would like to reverse>");
		String input = s.next();
		
		//System.out.println(input);
		
		reverseString(input);
		reverseStringStringBuilder(input);
	}
	
	// Created a new method for getSum
	public void reverseString(String input) {
		
		// for loop
		String output = "";
		//String character = "";
		for(int i = input.length()-1; i >= 0; i--) 
		{
			//System.out.print(input.charAt(i));
			//character = Character.toString(input.charAt(i));
			output = output.concat(Character.toString(input.charAt(i)));	
			
		}
		
		System.out.println("For Loop Reversed String: " + output);
		System.out.println(" ");
		System.out.println(" ");
		 
	}
	
	public void reverseStringStringBuilder(String input) {
		StringBuilder sb = new StringBuilder(input);
		
		sb.reverse();
		System.out.println("String builder Reversed String: " + sb);
		
	}
	
	
}

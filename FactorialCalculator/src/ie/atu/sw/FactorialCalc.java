package ie.atu.sw;

import java.util.Scanner;

// Get the input of an integer from user
// Recursively work out the factorial 
// Return the answer to the user


public class FactorialCalc {
	
	private static Scanner scanner;
	
	 
	public FactorialCalc() {
	
		scanner = new Scanner(System.in);
		
		int nValue = userInput();
		int result = factorial(nValue);
		
		System.out.println(result);
	}
	
	
	public static int userInput() {
		
		System.out.println("Enter a n value that you would like the factorial of>");
		String input = scanner.next();
		int n = Integer.parseInt(input);
		
		return n;
	}
	
	
	public static int factorial(int n) {
		if(n == 0) 
		{
			return 1;
		}
		else
		{
			int recurse = factorial(n-1);
			int result = n * recurse;
			return result;
		}

	}
	
	
	public static void main(String[] args) {
		new FactorialCalc();
	}
}

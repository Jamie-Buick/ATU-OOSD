package ie.atu.sw;

import java.util.Scanner;

// Get the input of an integer from user
// Recursively work out the factorial 
// Return the answer to the user


public class FibCalc {
	
	private static Scanner scanner;
	
	 
	public FibCalc() {
	
		scanner = new Scanner(System.in);
		
		int nValue = userInput();
		int result = fibonacci(nValue);
		
		System.out.println(result);
	}
	
	
	public static int userInput() {
		
		System.out.println("Enter a n value for the Fibonacci sequence>");
		String input = scanner.next();
		int n = Integer.parseInt(input);
		
		return n;
	}
	
	
	public static int fibonacci(int n) {		//4
		if(n == 0)
		{
			return 0;
		}
		else if(n == 1) 
		{
			return 1;
		}
		else
		{
		
			return  fibonacci(n-1) + fibonacci(n-2);
		}
	}
	
	
	public static void main(String[] args) {
		new FibCalc();
	}
}

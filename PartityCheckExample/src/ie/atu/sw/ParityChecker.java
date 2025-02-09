package ie.atu.sw;
import java.util.Scanner;

public class ParityChecker {

	
	public static void main(String[] args) {
		
		// added the scanner stuff just for fun
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		
		// only accepts an integer input 
		int x = scanner.nextInt();
		printParity(x);
		
		scanner.close();
	}
	
	
	public static void printParity(int x) {
		if(x % 2 == 0) {		// if the remainder of x / 2 is equal to 0 the number is even
			System.out.println("x is even!");
		}
		else
		{
			System.out.println("x is odd");
		}
	}
}

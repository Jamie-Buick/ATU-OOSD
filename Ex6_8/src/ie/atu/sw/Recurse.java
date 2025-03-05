package ie.atu.sw;

public class Recurse {
	
	// First:  Returns the first character of the given String
	public static char first(String s) {
		return s.charAt(0);
	}
	
	// Last: returns a new String that contains all but the first letter of the given string
	public static String rest(String s) {
		return s.substring(1,s.length());
	}
	
	// Length: Returns the length of a given String
	public static int length(String s) {
		return s.length();
	}
	
	// Print each letter on new line
	public static void printString(String s) {
		for (int i = 0; i <= s.length() - 1; i++ ) {
			System.out.println(s.charAt(i));
		}
	}
	
	
	// Print each letter on new line backwards
	public static void printBackward(String s) {
		for (int i = s.length()-1; i >= 0; i-- ) {
			System.out.println(s.charAt(i));
		}
	}
	
	// Print each letter on new line backwards
	public static void reverseString(String s) {
		for (int i = s.length()-1; i >= 0; i-- ) {
			System.out.print(s.charAt(i));
		}
	}
	

	
	
	public static void main(String[] args) {
		String testString = "JamieBuick";
		
		System.out.println("First Char: " + first(testString));
		System.out.println("Rest of String: " + rest(testString));
		System.out.println("Length: " + length(testString));
		
		System.out.println("----------------------------------------------------");
		System.out.println("Non-Recursive");
		System.out.println("----------------------------------------------------");
		System.out.println("");
		
		System.out.println("Each char printed on new line: ");
		printString(testString);
		System.out.println("");
		
		System.out.println("Each char printed on new line backwards: ");
		printBackward(testString);
		System.out.println("");
		
		System.out.println("Each char printed on same line backwards: ");
		reverseString(testString);
		System.out.println("");
		

		
		
	}

}

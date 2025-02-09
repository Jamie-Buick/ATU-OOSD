package ie.atu.sw;

public class PrintTwice {
	
	
	public static void main(String[] args) {
		
		String argument = "This is a string";
		printTwice(argument);
	}
	
	public static void printTwice(String s) {
		System.out.println(s);
		System.out.println(s);
	
	}

}

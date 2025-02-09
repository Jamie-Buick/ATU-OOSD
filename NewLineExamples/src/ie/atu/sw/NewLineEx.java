package ie.atu.sw;

public class NewLineEx {

	public static void main(String[] args) {
		System.out.println("First Line.");
		
		threeLines();
		System.out.println("Second Line.");
	}
	
	
	
	
	public static void newLine() {
		System.out.println("");
	}
	
	
	
	
	public static void threeLines() {
		newLine();
		newLine();
		newLine();
	}
	
}

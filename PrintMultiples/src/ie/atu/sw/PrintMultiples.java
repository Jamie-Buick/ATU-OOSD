package ie.atu.sw;

public class PrintMultiples {

	public static void printMultiplesWhile(int n) {
		int i = 1;
		while(i <= 6) {
			System.out.print(n*i + "    ");
			i = i + 1;
		}
	}
	
	
	
	
	public static void printMultiplesFor(int n) {
		
		for(int i = 1; i <= 6; i++) {
			System.out.print(n*i + "    ");
		}
		System.out.println(" ");
	}
	
	public static void printMultTable() {
		int i = 1;
		while(i <= 6) {
			printMultiplesFor(i);
			
			i = i + 1;
			
		}
	}
	
	

	
	
	public static void main(String[] args) {
		//printMultiplesWhile(5);
		//System.out.println(" ");
		//printMultiplesFor(5);
		printMultTable();
		
	}
}

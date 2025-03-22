package ie.atu.sw;

public class PrintMultiples {

	public static void printMultiplesWhile(int n) {
		int i = 1;
		while(i <= 6) {
			System.out.print(n*i + "    ");
			i = i + 1;
		}
	}
	
	
	
	
	
	public static void printMultiplesFor(int n, int max) {
		
		for(int i = 1; i <= max; i++) {
			System.out.print(n*i + "    ");
		}
		System.out.println(" ");
	}
	
	public static void printMultTable(int max) {
		int i = 1;
		while(i <= max) {
			printMultiplesFor(i, i); // This makes it 1x1, 2x1 2x2, 3x1, 3x2 etc...
			
			i = i + 1;
			
		}
	}
	
	
	
	
	public static void main(String[] args) {
		//printMultiplesWhile(5);
		//System.out.println(" ");
		//printMultiplesFor(5);
		printMultTable(7);
		
	}
}

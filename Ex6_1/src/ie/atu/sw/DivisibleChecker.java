package ie.atu.sw;

public class DivisibleChecker {
	
	public static boolean isDivisible(int n, int m) {
		
		return (n % m == 0);
	}
	
	
	
	public static void main(String[] args) {
		
		
		System.out.println(isDivisible(4,3));
	}
}

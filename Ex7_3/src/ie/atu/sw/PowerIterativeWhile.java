package ie.atu.sw;

public class PowerIterativeWhile {

	public static double power(double x, int n) {
		double power = 0;
		
		// initial value for power to start the iterative loop. Need to subtract 1 from n here after the first
		// multiplication
		
		if (n == 0) 
		{
			return 1;
		}
		
		if (n == 1) {
			return x;
		}
		if (n < 0) {
			// not sure I can do this without another while
		}
		
			
		power = x * x;
		n = n - 1;
		System.out.println("Initial power calc: " + power);
	
		
		while(n > 1) {
			n = n - 1;
			System.out.print("N Value: " + n + "    " );
			power = power * x;
			System.out.println("Iterative power calc: " + power);
			
		}
		
	
		return power;
	}
	
	
	
	public static void main(String[] args) {
		double ans = power(5,25);
		System.out.println("Final Value: " + ans);
	}
	
	
	
	
	
	
}

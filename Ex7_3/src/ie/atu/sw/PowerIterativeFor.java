package ie.atu.sw;

public class PowerIterativeFor {


	public static double power(double x, int n) {
		
		double nextVal = x;
		double result = 0;
		int nAbs = Math.abs(n);
		
		// initial value for power to start the iterative loop. Need to subtract 1 from n here after the first
		// multiplication
		
		if (n == 0) 
		{
			return 1;
		}
		
		if (n == 1) {
			return x;
		}
	
		
		for (int i = 1; i < nAbs; i++) 
		{ 
			result = nextVal * x;
			nextVal = result;
			
			System.out.print("result: " + result);
			System.out.println("     nextVal: " + nextVal);
		}
		
		
		if (n < 1) 
		{ 
			result = 1.0 / result;
		}
		
	
		return result;
	}
	
	
	
	public static void main(String[] args) {
		double ans = power(2,1);
		System.out.println("Final Value: " + ans);
	}
	
	
	
}
	
	


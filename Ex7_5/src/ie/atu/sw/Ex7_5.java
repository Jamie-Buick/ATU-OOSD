package ie.atu.sw;

public class Ex7_5 {

	
	public static double myexp(int x) {
		
		double result = 0; 
		double term;
				
		for(int i = 0; i <= 30; i++) 
		{
			term = Math.pow(x, i)/factorial(i);
			result += term;
		}
		
		
		System.out.println(result);
		
		return result;
	}
	
	// My factorial function from previous exercise
	public static double factorial(int n) {
		double result = 1;
		double prevAns = n;
		

		for(int i = n-1; i > 0 ; i--)
		{
			result = prevAns * i;
			prevAns = result;
		}
		
		return result;
	}
	
	
	
	public static void main(String[] args) {
		
		myexp(10);
	}
}

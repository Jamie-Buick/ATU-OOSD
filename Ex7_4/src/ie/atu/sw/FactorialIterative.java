package ie.atu.sw;

public class FactorialIterative {

	
	public static double factorial(int n) {
		double result = 1;
		double prevAns = n;
		

		for(int i = n-1; i > 0 ; i--)
		{
			result = prevAns * i;
			prevAns = result;
			
			//System.out.print(i + "     ");
			//System.out.println(prevAns);	
		}
		
		return result;
	}
	
	
	
	public static void main(String[] args) {
		double result = factorial(0);
		System.out.println("Final  Result - " + result);
	}
}

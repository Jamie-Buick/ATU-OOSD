package ie.atu.sw;

public class Power {

	
	public static double power(double x, int n) {
		
		
		
		if(n == 0) 
		{
			return 1;
		}
		else if(n > 0)
		{
			return x * power(x, n-1);
		}
		else
		{
			return 1 / power(x,-n); 
		}
		
		
	}
	
	
	public static void main(String[] args) {
		
		double ans = power(2, -2);
		System.out.println(ans);
		
	}
}

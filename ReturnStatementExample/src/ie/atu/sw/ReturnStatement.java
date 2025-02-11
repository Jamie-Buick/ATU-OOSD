package ie.atu.sw;

public class ReturnStatement {

	public static void main(String[] args) {
		
		double a = -2;
		printLogarithm(a);
		
	}
	
	public static void printLogarithm(double x) {
		if(x <= 0.0) 
		{
			System.out.println("Positive numbers only, please!");
			return;
		}
		
		double result = Math.log(x);
		System.out.println("The log of x is: " + result);
	}

}

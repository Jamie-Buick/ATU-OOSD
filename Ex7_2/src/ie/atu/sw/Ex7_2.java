package ie.atu.sw;

public class Ex7_2 {

	
	public static double squareRoot(double a){
	
		double x_0 = a / 1.5; // I changed this to / by 1.5 to match the initial x_0 value of 6 
		double x = 0;
		

		// I had to change this with the use of chatgbt because my while loop originally was finishing after the fist loop due to 
		// the values being the same and then being checked immediately. I needed to wait for a new x value before checking the condition.
		// This makes more sense now 
		while(true) {
			 x = (x_0 + a / x_0) / 2;
			 
			 if(Math.abs(x - x_0) <= 0.0001) {
				 return x;
				 //break;
			 }
			 
			 x_0 = x;
			 System.out.println("Current x: " + x);
			 //System.out.println("Current x_0: " + x_0);
			 //System.out.println(x_0);
 
		}
		
		
	}
	
	
	public static void main(String[] args) {
		
		double squareRoot = squareRoot(9);
		System.out.println("Final Estimation: " + squareRoot);
		
		
	}
}

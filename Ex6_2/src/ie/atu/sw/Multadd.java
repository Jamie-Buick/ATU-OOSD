package ie.atu.sw;

public class Multadd {

	
	public static double multadd(double x, double y, double z) {
	
		double multAdd = x * y + z;
	
		return multAdd;
	}
	
	public static double yikes(double x) {
		

		double ansTest = multadd(x, Math.exp(-x), Math.sqrt(1 - Math.exp(-x)));
		
		return ansTest;
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		double ans = multadd(2,3,4);
		System.out.println("multadd - " + ans);
		
		double q4a = multadd(0.5, Math.cos(Math.PI/4), Math.sin(Math.PI/4));
		System.out.println("q4a - " + q4a);
		
		double q4b = Math.log(10) + Math.log(20); 
		System.out.println("q4b - " + q4b);
		
		double ansYikes = yikes(ans);
		System.out.println("yikes - " + ansYikes);
		
	}
}

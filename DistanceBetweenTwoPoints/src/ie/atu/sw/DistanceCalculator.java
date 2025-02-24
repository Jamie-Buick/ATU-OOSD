package ie.atu.sw;

public class DistanceCalculator {

	public static void main(String[] args) {
		
		//x1,y1,x2,y2
		double distance = distance(0, 0, 3, 4);
		System.out.println("The distance between the 2 Coordinates is: " + distance);
		
	}
	
	public static double distance(double x1, double y1, double x2, double y2) {
		
		double dx = x2 - x1;
		double dy = y2 - y1;
		
		double dSquared = (dx * dx) + (dy * dy);
		double dRoot = Math.sqrt(dSquared);
		//System.out.println(dRoot);
		
		return dRoot;
	}
}



//Get an input
//Use the equation to Calc and return the values
//Print value in the main
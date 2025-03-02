package ie.atu.sw;

public class TriangleVerification {

	
	public static boolean isTriangle(double a, double b, double c) {
		if(a + b > c && a + c > b && b + c > a)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	public static void main(String[] args) {
	   System.out.println(isTriangle(10, 10, 25));  // Expected: false (because 10 + 10 is not greater than 25)
       System.out.println(isTriangle(3, 4, 5));    // Expected: true (valid triangle)
       System.out.println(isTriangle(5, 5, 8));    // Expected: true (valid triangle)
       System.out.println(isTriangle(1, 2, 3));    // Expected: false (invalid triangle)
	}
}

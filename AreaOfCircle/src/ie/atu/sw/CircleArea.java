package ie.atu.sw;

public class CircleArea {

	
		
		public static double distance(double x1, double y1, double x2, double y2) {
		
			double dx = x2 - x1;
			double dy = y2 - y1;
			
			double dSquared = (dx * dx) + (dy * dy);
			double dRoot = Math.sqrt(dSquared);
			
			return dRoot;
		}
		
		
		public static double area(double radius) {
			double area = Math.PI * Math.pow(radius,2);
			
			return area;
		}
		
		
		public static double circleArea(double xc, double yc, double xp, double yp) {
			double radius = distance(xc,yc,xp,yp);
			double area = area(radius);
			
			return area;
		}
		
		
		
		public static void main(String[] args) {
			//x1,y1,x2,y2
			double circleArea = circleArea(0, 0, 0, 2);
			System.out.println("The area is: " + circleArea);
			
		}
	}

	


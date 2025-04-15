package ie.atu.sw;

import java.util.concurrent.ThreadLocalRandom;

public class Ex12_2 {

	public static double randomDouble(double x, double y) {
		ThreadLocalRandom random = ThreadLocalRandom.current();
	    double rand = random.nextDouble(x,y);
	    
	    return rand;
	}
	
	// Ex12_3
	public static int randomInt(int x, int y) {
		ThreadLocalRandom random = ThreadLocalRandom.current();
	    int rand = random.nextInt(x,y);
	    
	    return rand;
	}
	
	
	public static void main(String[] args) {
		double outputDouble = randomDouble(2.5,8.5624);
		int outputInt = randomInt(5,50);
		System.out.println(outputDouble + "  " + outputInt );
	}
}

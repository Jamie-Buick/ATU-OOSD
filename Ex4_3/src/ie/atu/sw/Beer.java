package ie.atu.sw;

public class Beer {

	public static void bottlesBeer(int n) {
		if(n > 1) 
		{
			System.out.println(n + " bottles of beer on the wall, " + n + " bottles of beer, ya’ take one down, ya’ pass it around, " 
								+ (n-1) + " bottles of beer on the wall.");
			bottlesBeer(n-1);
		}
		else if (n == 1)
		{
            System.out.println("1 bottle of beer on the wall, 1 bottle of beer, ya’ take one down, ya’ pass it around, "
                + "no more bottles of beer on the wall.");
            bottlesBeer(n-1);
	    }
		else 
		{
			System.out.println("No bottles of beer on the wall, no bottles of beer, ya’ can’t take"
					+ "one down, ya’ can’t pass it around, ’cause there are no more"
					+ "bottles of beer on the wall!");
		}
	}
		
	
	
	public static void main(String[] args) {
		
		int beer = 99;
		bottlesBeer(beer);
		

	}

}

package ie.atu.sw;


public class ProgArgs {

	public static void main(String[] args) {
		
		System.out.println(args + " -----------> " + args.length);
		
		// Best option for Arrays
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
			
			if (args[i].equals("ATU")) 
			{
				System.out.println("\tWish you were here....");
			}
		}
		
		// For in loop or for each loop. Doesn't have indexing 
		for(String s : args) {
			System.out.println(s);
		}
	
	}
}

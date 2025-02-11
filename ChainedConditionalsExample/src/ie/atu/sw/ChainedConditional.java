package ie.atu.sw;

public class ChainedConditional {

	public static void main(String[] args) {
		int x = -1;
		
		if(x > 0)
		{
			System.out.println("X is positive");
		}
		else if(x < 0)
		{
			System.out.println("X is negative");
		}
		else
		{
			System.out.println("X is Zero");
		}
	}
	
	
}

package ie.atu.sw;

public class BlastOff {


	public static void main(String[] args) {
		int n = 0;
		countdown(n);
	}
	
	public static void countdown(int n){
		
		if(n == 0)
		{
			System.out.println("Blast Offff!!!");
		}
		else
		{
			System.out.println(n);
			countdown(n-1);
		}
		
	}
	
	
	
}

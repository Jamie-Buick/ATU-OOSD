package ie.atu.sw;

import java.lang.Math;


public class FermatsLastTheorem {

	public static void checkFermat(int a, int b, int c, int n) {
		a = raiseToPow(a,n);
		b = raiseToPow(b,n);
		c = raiseToPow(c,n);
		
		//System.out.println(a);
		//System.out.println(b);
		//System.out.println(c);
		
		int ab = a + b;
		
		if (n > 2) 
		{
			if (ab == c)
			{
				System.out.println("Holy smokes, Fermat was wrong!");
			}
			else 
			{
				System.out.println("No, that doesn't work");
			}
		}
		else
		{
			System.out.println("Fermat’s theorem only applies for n > 2.");
		}
		
	}
	
	
	public static int raiseToPow(int x, int y) {
		int z = (int) Math.pow(x, y);
		
		return z;
	}
	
	
	public static void main(String[] args) {
		
		checkFermat(1,1,2,3);
	
	}
}

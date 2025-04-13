package ie.atu.sw;

import java.util.Arrays;

// Read in values from String[] in main
// Convert into a int array
// Discard values that arent primes

public class PrimeParser {

	public static void main(String[] args) {
		if( args.length > 0 ) 
		{
			int[] intArray = parseToInt(args);
			int[] primeArray = primeArray(intArray);
			
			for (int i = 0; i < primeArray.length; i++)
			{
				System.out.println(primeArray[i]);
			}
		
		}
	}
	
	
	public static int[] parseToInt(String[] args) {
		int[] intArgs = new int[args.length];
		
		for (int i = 0; i < args.length; i++) {
			intArgs[i] = Integer.parseInt(args[i]);
		}
		return intArgs;
	}
	
	
	
	public static int[] primeArray(int[] intArray) {
		int primeCounter = 0;
		int[] primeArray = new int[intArray.length];
		
		for (int i = 0; i < intArray.length; i++) {
		    boolean isPrime = true; // assume it's prime unless we find a divisor

		    if (intArray[i] <= 1) 
		    {
		        isPrime = false; // 0 and 1 are not prime
		    } 
		    else 
		    {
		        for (int j = 2; j < intArray[i]; j++) {
		            if (intArray[i] % j == 0) {
		                isPrime = false; // found a divisor
		                break;
		            }
		        }
		        
		    }
		  
		   
		    if (isPrime) {
		    	
			    	primeArray[primeCounter] = intArray[i];
			        primeCounter++;
		    }
		}

		return Arrays.copyOf(primeArray, primeCounter);
	
	
	}
}

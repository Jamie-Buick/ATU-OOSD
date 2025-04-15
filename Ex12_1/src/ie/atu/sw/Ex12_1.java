package ie.atu.sw;

import java.util.concurrent.ThreadLocalRandom;

public class Ex12_1 {

	
	public static int[] cloneArray(int[] inputArray) {
		int[] outputArray = new int [100];
		
		for (int i = 0; i <=inputArray.length-1; i++) {
			outputArray[i] = inputArray[i];
		}
		
		return outputArray;
	}
	
	
	public static void main(String[] args) {
		
		ThreadLocalRandom random = ThreadLocalRandom.current();
		
		// Create new arrays
		int[] inputArray = new int [100];
		int[] outputArray = new int [100];
		
		// Generate random numbers and add this to the input array
		for (int i = 0; i <=inputArray.length-1; i++) {
			inputArray[i] = random.nextInt(1,101);
		}
		
		// Feed inputArray into cloneArray method
		outputArray = cloneArray(inputArray);
		
		for (int i = 0; i <=outputArray.length-1; i++) {
			System.out.println(inputArray[i] + "	" + outputArray[i]);
		}
	}
}

package ie.atu.sw;

import java.util.concurrent.ThreadLocalRandom;

public class Ex12_9 {
	
	
	public static int maxInRange(int[] inputArray, int lowIndex, int highIndex) {
		
		int maxValue = 0;
		
		
		if (lowIndex == highIndex) 
		{
			return maxValue = inputArray[lowIndex];
		}
		else
		{
			int mid = (lowIndex + highIndex) / 2;
		
			int leftMaxValue = maxInRange(inputArray, lowIndex, mid);
			int rightMaxValue = maxInRange(inputArray, mid + 1, highIndex);
			System.out.println(leftMaxValue + "   " + rightMaxValue);
			return Math.max(leftMaxValue, rightMaxValue);
		}
		
		 
	}
	
	
	public static void main(String[] args) {
		
		ThreadLocalRandom random = ThreadLocalRandom.current();
		
		// Create new arrays
		int[] inputArray = new int [100];
		
		
		int high = random.nextInt(1,101);
		int low = random.nextInt(1,101);
		
		if(high < low) 
		{
			int tmp = high;
			high = low;
			low = tmp;
		}
		
		//System.out.println(low + "  " + high);
	
		// Generate random numbers and add this to the input array
		for (int i = 0; i <=inputArray.length-1; i++) {
			inputArray[i] = random.nextInt(1,101);
			//System.out.println(inputArray[i]);
		}
		
		int ans = maxInRange(inputArray, low, high);
		System.out.println(ans);
	}
}

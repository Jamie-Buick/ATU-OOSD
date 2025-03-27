package ie.atu.sw;

import java.util.*;


public class SumOfSeries {
	
	private Scanner s;

	
	
	
	public SumOfSeries() {
		s = new Scanner(System.in);
	}

	public void getInput() {
		
		//Get a min and max value for the series to be counted
		System.out.println("Please enter the minimum number of the series>");
		int min = Integer.parseInt(s.next());
		
		System.out.println("Please enter the maximum number of the series>");
		int max = Integer.parseInt(s.next());
		
		System.out.println("min val: " + min + "      max val: " + max);
		
		// Rearranging the values if the entered values do not satisfy min < max
		if(max < min) 
		{
			System.out.println("I have rearranged the valves you have entered. As max was less than the minimum!");
			int tmpMax = max;
			
			max = min;
			min = tmpMax;
			
			System.out.println("min val: " + min + "      max val: " + max);
		}
		
		
		getSum(min,max);
	
		
	}
	
	// Created a new method for getSum
	public void getSum(int min, int max) {
		
		// for loop
		int counter = 0;
		for(int i = min; i <= max; i++) 
		{
			counter += i;
			//System.out.println(counter);
		}
		System.out.println("Sum of the Series Answer: " + counter);
	}
	
	
}

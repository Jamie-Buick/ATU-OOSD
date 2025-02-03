package ie.atu.sw;

public class Time {
	
	public static void main(String[] args) {
		
		int hour, minute, second, secsUsed, secsRemaining, secsTotal, percentPassed;
		
		hour = 6;
		minute = 30;
		second = 45;
		
		//Prints out my current time without adding the variables 
		System.out.print("Current Time: ");
		System.out.println(hour +  ":" + minute + ":" + second);
		
		
		// Calculate the number of seconds since midnight
		
		/*
		 *  Convert hours into seconds
		 *  Convert minutes into seconds 
		 * Add hours, minutes and seconds as there 'second' values 
		*/
		 
		
		secsUsed = hour*3600 + minute*60 + second;
		System.out.print("Seconds since midnight: ");
		System.out.println(secsUsed);
		
		// Calculate the number of seconds left until midnight
		
		/* 
		 *  Calculate how many seconds in 24 hours
		 *	Subtract that from secsUsed 
		*/
		System.out.print("Seconds until midnight: ");
		secsRemaining = 24*3600 - secsUsed;
		System.out.println(secsRemaining);
		
		// Calculate the percentage of the day passed using the total number of seconds in 24 hours
		secsTotal = secsUsed + secsRemaining;
		percentPassed = secsUsed * 100 /  secsTotal;
		System.out.print("Percent of the day Remaining: ");
		System.out.println(percentPassed + "%");
		
	}

}

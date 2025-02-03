package ie.atu.sw;

public class Date {
	
	public static void main(String[] args) {
		
		// Step 2
		int date,  year;
		String day, month;
		
		day = "Monday";
		month = "January";
		
		date = 3;
		year = 2025;
		
		// Step 3 - Commenting out to clear up terminal
		/*
		System.out.println(day);
		System.out.println(date);
		System.out.println(month);
		System.out.println(year);
		*/
		
		
		//Step 4 Commenting out to clear up terminal
		/*
		System.out.println(day + ", " + month + " " + date + ", " + year);
		*/

		//Step 5
		System.out.println("American Format: ");
		System.out.println(day + ", " + month + " " + date + ", " + year);
		System.out.println("European Format: ");
		System.out.println(day + " " + date + " " + month + ", " + year);
		

	}
}




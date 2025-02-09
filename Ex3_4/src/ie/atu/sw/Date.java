package ie.atu.sw;

public class Date {
	
	
	public static void printAmerican(int date, int year, String day, String month) {
		System.out.println("American Format: ");
		System.out.println(day + ", " + month + " " + date + ", " + year);
	}
	
	public static void printEuropean(int date, int year, String day, String month) {
		System.out.println("European Format: ");
		System.out.println(day + " " + date + " " + month + ", " + year);
	}
	
	
	
	
	
	public static void main(String[] args) {
	
		int date = 9,  year = 2025;
		String day = "Saturday", month = "February";
		
	
	
		printAmerican(date, year, day, month);
		System.out.println("");
		printEuropean(date, year, day, month);

	}
	
	
	

	
	
}




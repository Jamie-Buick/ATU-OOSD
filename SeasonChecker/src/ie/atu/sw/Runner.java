package ie.atu.sw;

import java.time.LocalDate;
import java.time.Month;

public class Runner {

	
	public static void main(String[] args) {
		var sc = new SeasonChecker();
		String season = sc.getSeason(LocalDate.of(1999, Month.MARCH, 19));
		System.out.println(season);
	}
	
	
	
	
}

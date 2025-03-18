package ie.atu.sw;

import java.time.*;

public class SeasonChecker {

	public String getSeason(LocalDate date) {
		Month month = date.getMonth();
		
		return switch(month) {
			case FEBRUARY, MARCH, APRIL 		-> "Spring";
			case MAY, JUNE, JULY 				-> "Summer";
			case SEPTEMBER, OCTOBER 			-> "Autumn";
			case NOVEMBER, DECEMBER, JANUARY 	-> "Winter";
			default 							-> {
				//Ternary IF statement 
				yield (month == Month.AUGUST && date.getDayOfMonth() < 20) ? "Holiday Season" : "Autumn";
				
				/*
				if(month == Month.AUGUST && date.getDayOfMonth() < 20) 
				{
					yield "Holiday Season";
				}
				else
				{
					yield "Autumn";
				}
				*/
			}
		};
		
		
	}
	
	
}

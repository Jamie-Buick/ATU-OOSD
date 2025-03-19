package ie.atu.sw;

import static java.lang.System.*;

public class Runner {
	
	public int go3(TeamGame game) {
		
		return switch(game) {
			case SOCCER 				->  1;
			case RUGBY, HURLING 		-> -77;
			case ROUNDERS 				-> -100;
			case BASKETBALL, FOOTBALL 	-> -23;
		
		};
	}
	
	
	public void go(TeamGame game) {
		switch(game) {
			case SOCCER 				-> out.println("Soccer");
			case RUGBY, HURLING 		-> out.println("Fast Sport");
			case ROUNDERS 				-> out.println("Rounders");
			case BASKETBALL, FOOTBALL 	-> out.println("Catchy sports");
			
		}
	}
	
	public boolean go2(int num, String s) {
		
		int j = 0;
		
		return switch(num) {
			case 1 		-> j + 1 > 10;
			case 2, 3 	-> j * 3 < 2;
			default 	-> -1 >= 15;
		};	
	
	}
	
	
	public void go(int num, String s) {
		
		int j = 0;
		
		switch(num) {
			case 1 		-> j = j + 1;
			case 2, 3 	-> j = j * 3;
			default 	-> j = -1;
		}	
		
		
		switch(s) {
			case "Happy" 			-> j = 21;
			case "Hippy","Hoppy"	-> j = 22;
		}
	}
	
	
	
	
	public static void main(String[] args) {
		new Runner().go(42, "Happy days");
	}

}

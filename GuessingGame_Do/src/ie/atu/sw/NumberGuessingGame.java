package ie.atu.sw;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import static java.lang.System.*; // allows me to use out.println instead of System.out...

public class NumberGuessingGame {
	
	private static final int MAX_GUESSES = 12;
	private Scanner s;
	private int number;
	
	// Constructor 
	public NumberGuessingGame() {
		s = new Scanner(System.in);
	}

	public void start() {
		out.println("***************************************************");
		out.println("**            Number Guessing Game               **");
		out.println("***************************************************");
		
		// Ways to get random numbers!
		/*
		// method 1:
		number = (int)(Math.random() * 100); // down casting to an int means I do not not have to do a floor for getting rid of decimal point
		
		// method 2:
		Random rand = new Random();
		number = rand.nextInt(1, 101);
		*/
		
		
		// method 3 - The best - more random!!
		ThreadLocalRandom random = ThreadLocalRandom.current();
		number = random.nextInt(1,101);
		//out.println(number);
		
		boolean notGuessed = true;
		int counter = 0;
		
		do {
			out.println("Guess a number between 1 and 100> ");
			
			int guess = Integer.parseInt(s.next());
			
			
			if(guess == number)
			{
				notGuessed = false;
				out.println("CORRECT!!!!");
			}
			else if(guess > number)
			{
				out.println("Too high!!");
			}
			else
			{
				out.println("Too low!!");
			}
			counter++;
			out.println("You have " + (MAX_GUESSES - counter) + " tries left." );
			
			
			
		} while (counter < MAX_GUESSES && notGuessed);
		
	
		
		if(notGuessed) 
		{
			out.println("Too bad. The correct answer was: " + number);
		}
	}
	
	
}

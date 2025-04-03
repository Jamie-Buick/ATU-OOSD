package ie.atu.sw;

public class GuessingGameRecursive {

	
	
	public void guess(int number, int min, int max) {
		int guess = (int) (min + max) / 2;
		
		if ( guess == number ) 
		{
			System.out.println("Guessed " + guess + " Correctly");
			return;
		} 
		else if (guess > number) 
		{
			System.out.println("Guessed " + guess + " too high");
			max = guess - 1;
		}
		else
		{
			System.out.println("Guessed " + guess + " too low");
			min = guess + 1;
		}
		
		guess(number,min,max);
	}
	
	
	public static void main(String[] args) {
		GuessingGameRecursive rgg = new GuessingGameRecursive();
		int number = 767;
		rgg.guess(number, 0 , 1_000_000_000);
	}
}

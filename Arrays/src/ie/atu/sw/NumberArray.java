package ie.atu.sw;

import java.util.Iterator;
import java.util.concurrent.ThreadLocalRandom;

public class NumberArray {

	public void go() {
		//int[] numbers = new int[100];
		int[] numbers = generate(20);
		print(numbers);
		
		int total = 0;
		for (int i = 0; i < numbers.length; i++) {
			//total = total + numbers[i];
			total += numbers[i];
		}
		
		System.out.println("Total: " + total);
	}
	
	private int[] generate(int size) {
		int[] tmp = new int[size];
		generate(tmp);
		return tmp;
	}
	
	
	private void generate(int[] nums) {
		ThreadLocalRandom rnd = ThreadLocalRandom.current();
		
		for (int i = 0; i < nums.length; i++) {
			nums[i] = rnd.nextInt(1,101);		// give each element of the array a random number
		}
	}
	
	
	private void print(int[] nums) {
		System.out.print("[");
		for (int i = 0; i < nums.length; i++)
		{
			System.out.print(nums[i]);
			if (i < nums.length - 1) System.out.print(", "); // print , after each value except the end	
		}
		System.out.println("]");
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		new NumberArray().go();
	}
}

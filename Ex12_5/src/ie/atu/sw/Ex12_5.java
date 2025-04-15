package ie.atu.sw;

public class Ex12_5 {

	public static boolean areFactors(int[] nums, int n) {
		
		boolean isFactor = true;
		
		for (int i = 0; i < nums.length-1; i++)
		{
			if(nums[i] % n != 0)
			{
				isFactor = false;
			}
		}
		return isFactor;
	}
	
	
	
	public static void main(String[] args) {
		int n = 2;
		int nums[] = new int[10];
		
		for(int i = 0; i < 10; i++)
		{
			nums[i] = i * 2;
			System.out.println(nums[i]);
		}
		
		boolean isFactor = areFactors(nums, n);
		System.out.println(isFactor);
		
	}
}

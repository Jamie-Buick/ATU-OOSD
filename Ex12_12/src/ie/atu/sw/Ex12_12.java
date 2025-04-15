package ie.atu.sw;

public class Ex12_12 {

	public static boolean isDoubloon(String s) {
		
		boolean isDoubloon = true;
		int counter = 0;
		for(int i = 0; i <= s.length()-1; i++)
		{
			char current = s.charAt(i);
			
			for(int j = i+1; j < s.length()-1; j++) 
			{
				if (current == s.charAt(j))
				{
					isDoubloon = true;
					counter++;
					break;
				}
				// i think i need to not check the character again once I come accross it 
				
				else 
				{
					isDoubloon = false;	
				}
			}
			System.out.println(counter);
		}
		
		
		return isDoubloon;
	}
	
	
	public static void main(String[] args) {
		
		String s = "noon";
		boolean ans = isDoubloon(s);
		System.out.println(ans);
	}
}

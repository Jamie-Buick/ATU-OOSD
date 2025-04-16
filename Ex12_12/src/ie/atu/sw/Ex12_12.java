package ie.atu.sw;

public class Ex12_12 {

	public static boolean isDoubloon(String s) {
		
		boolean isDoubloon = true;
		
		
		
		for(int i = 0; i < s.length(); i++)
		{
			//char current = s.charAt(i);
			int counter = 0;
			for(int j = 0; j < s.length(); j++) 
			{
				if (s.charAt(i) == s.charAt(j))
				{
				
					counter++;
				}
			}
				
				if(counter != 2) 
				{
					isDoubloon = false;
					break;
				}
			}
			//System.out.println(isDoubloon);
		
		
		
		return isDoubloon;
	}
	
	
	public static void main(String[] args) {
		
		String s = "appearer";
		boolean ans = isDoubloon(s);
		System.out.println(ans);
	}
}

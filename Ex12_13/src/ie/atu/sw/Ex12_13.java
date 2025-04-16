package ie.atu.sw;

public class Ex12_13 {

	
	public static boolean isAnagram(String s1, String s2) {
		

		boolean isAnagram = false;
		
		
		if(s1.length() == s2.length()) {
			
			int counter = 0;
			
			for (int i = 0; i < s1.length(); i++) {
				
				for(int j = 0; j < s2.length(); j++) {
					
					if(s1.charAt(i) == s2.charAt(j))
					{
						counter++;
						break;
					}
			
				}
				
			}	
			System.out.println(counter);
			
			if(counter == s1.length()) 
			{
				isAnagram = true;
			}
		}
		
		
		return isAnagram;
		
		
	}

	
	public static void main(String[] args) {
		String s1 = "allen downey";
		String s2 = "well annoyed";
		
		boolean isAnagram = isAnagram(s1,s2);
		System.out.println(isAnagram);
	}
}

package ie.atu.sw;

public class Palindrome {

	public static String first(String s) {
		
		char firstCharacter = s.charAt(0);
		
		return Character.toString(firstCharacter);

	}
	
	
	public static String last(String s) {
		
		char lastCharacter = s.charAt(s.length()-1);
		
		return Character.toString(lastCharacter);
	
	}
	
	
	public static String middle(String s) {
		
		String middle = s.substring(1, s.length()-1);
		
		return middle;
	}
	
	
	public static boolean isPalindrome(String s) {
		boolean isPal = false;
		//System.out.println(s.length());
		if (s.length() < 1 || s.isBlank()){
			
			isPal = true;
		}
		else if (s.charAt(0) == s.charAt(s.length()-1) ) 
		{
			//System.out.println("yes");
			isPal = isPalindrome(s.substring(1, s.length()-1));
			//isPal = true;
		}
		else
		{
			isPal = false;
		}
		
		return isPal;
	}
	
	
	
	
	
	public static void main(String[] args) {
		String s = "oottoo";
		//String firstCharacter = first(s);
		//System.out.println(firstCharacter);
		
		//String middle = middle(s);
		//System.out.println(middle);
		
		
		//String lastCharacter = last(s);
		//System.out.println(lastCharacter);
		
	
		boolean isPal = isPalindrome(s);
		System.out.println(isPal);
	}
}

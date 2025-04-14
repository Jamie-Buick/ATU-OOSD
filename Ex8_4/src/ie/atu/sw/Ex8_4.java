package ie.atu.sw;

public class Ex8_4 {

	// This method increments over the input string s and adds 1 to a counter when it sees ( and subtracts from counter
	// when it sees )
	
	public static int count(String s) {
		int len = s.length();
		int i = 0;
		int count = 0;
		
		
		while (i < len) {
			char c = s.charAt(i);
			
			if (c == '(') 
			{
				count++;
			} 
			else if (c == ')')
			{
				count--;
			}
			
			i++;
		}
		//System.out.println(count);
		
		
		return count;
	}
	
	
	public static void main(String[] args) {
		int count = count("\"((3 + 7) * 2)\";");
		System.out.println(count);
	}
}

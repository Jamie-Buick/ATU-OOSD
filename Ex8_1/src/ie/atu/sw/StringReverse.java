package ie.atu.sw;

public class StringReverse {

	
	public static String reverse(String input) {
		
		StringBuilder sb = new StringBuilder();

		for(int i = input.length()-1; i >= 0; i--)
		{
			char c = input.charAt(i);
			//System.out.print(c);
			sb.append(c);
		}
		
		return sb.toString();
	}
	
	
	public static void main(String[] args) {
		String output = reverse("Hello");
		System.out.println(output);
	}
}

package ie.atu.sw;

public class Abecedarian {

	
	public static boolean isAbecedarianItr(String s) {
		boolean isAbecedarian = true;
		
		for (int i = 0; i < s.length()-1; i++) {
			char c1 = s.charAt(i);
			char c2 = s.charAt(i+1);
			
			if(c2 < c1) 
			{
				isAbecedarian = false;
			}	
		}
		return isAbecedarian;
	}
	

	
	public static void main(String[] args) {
		
		String s = "acknow";
		boolean isAbecedarianItr = isAbecedarianItr(s);
		System.out.println("final: " + isAbecedarianItr);
		
	}
}

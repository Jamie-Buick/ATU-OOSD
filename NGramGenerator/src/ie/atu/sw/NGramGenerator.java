package ie.atu.sw;

public class NGramGenerator {

	
	public String[] getNGrams(String s, int n) {
		int numGrams = s.length() - (n - 1);
		String[] strArray = new String[numGrams];
	
		for (int i = 0; i < numGrams; i++)
		{
			strArray[i] = s.substring(i, i + n);
			//System.out.println(strArray[i]);
		}
		
		
		return strArray;
	}
	
	
	
	public static void main(String[] args) {
		
		String input = "Happy Days";
		NGramGenerator gen = new NGramGenerator();
		String[] NGram = gen.getNGrams(input, 4);
		
		for (int i = 0; i < NGram.length; i++)
		{
			System.out.println(NGram[i]);
		}
	
		
		
	}

	
}

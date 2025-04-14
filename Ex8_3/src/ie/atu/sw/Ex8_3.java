package ie.atu.sw;

public class Ex8_3 {
	
	
	public static void countLetters(String word, char a) {
		
		int length = word.length();
		int count = 0;
		int index = 0;
		
		/*
		while (index < length) {
			if (word.charAt(index) == a ) 
			{
				count = count + 1;
			}
			index = index + 1;
		}
		System.out.println(count);
		*/
		
		index = word.indexOf(a);
		while (index != -1) {
			
			index = word.indexOf(a, index+1);
			//System.out.println(index);
			count++;
		}
		System.out.println(count);
			
	}
		
		
		
	public static void main(String[] args) {
		countLetters("Bananaananananananaaaa", 'a');
	}
}

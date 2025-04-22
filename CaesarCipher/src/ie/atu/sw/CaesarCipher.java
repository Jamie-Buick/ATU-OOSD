package ie.atu.sw;

public class CaesarCipher {

	private int key = 0;

	public CaesarCipher(int key) {
		this.key = key;
	}
	
	private String transform(String s, boolean encrypt) {
		
		StringBuilder sb = new StringBuilder("");
		
	
		for (int i = 0; i < s.length(); i++) 
		{
			if(encrypt) 
			{
				char ch = (char) (s.codePointAt(i) + key);
				sb.append(ch); 
			}
			else
			{
				char ch = (char) (s.codePointAt(i) - key);
				sb.append(ch); 
			}
			
			
		}
		
		
		return sb.toString();
	}
	
	public String encrypt(String plainText) {
		boolean encrypt = true;
		
		return transform(plainText, encrypt);
	}
	
	public String decrypt(String cipherText) {
		boolean encrypt = false;
	
		return transform(cipherText, encrypt);
	}
	
	
	
}

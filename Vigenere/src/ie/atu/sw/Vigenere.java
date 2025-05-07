package ie.atu.sw;

public class Vigenere {

	public static final int MIN_KEY_SIZE = 10;
	public static final int MAX_KEY_SIZE = 100;
	private char[] key = null;
	
	public Vigenere(String key) throws Exception {
		setKey(key);
	}
	
	public void setKey(String key) throws Exception {
		this.validateKey(key);

		this.key = key.trim().toUpperCase().toCharArray();
	}

	private void validateKey(String key) throws Exception {
		if(key == null)
		{
			throw new Exception("Vigenere error: key cannot be null!");
		}
		else if(key.length() < MIN_KEY_SIZE || key.length() > MAX_KEY_SIZE) 
		{
			throw new Exception("Vigenere error: key must be between " + MIN_KEY_SIZE + " and " + MAX_KEY_SIZE + " !" );
		}
	}
	
	private void validateText(String text) throws Exception {
		if(text == null || text.length() < MIN_KEY_SIZE)
		{
			throw new Exception("Vigenere error: the minimum size of plain and cipher text is " + MIN_KEY_SIZE);
		}
	}
	
	
	
	public String encrypt(String plainText) throws Exception {
		validateText(plainText);
		return transform(true, plainText);
	}
	
	
	private char getEncryptedCharacter(char key, char plain) {
		
		for (int row = 0; row < TABULA_RECTA.length; row++ ) {
			
			if(TABULA_RECTA[row][0] == key)
			{
				for (int col = 0; col < TABULA_RECTA[row].length; col++ ) {
					
					if(TABULA_RECTA[0][col] == plain)
					{
						return TABULA_RECTA[row][col];
					}
				}
			}
		}
		
		return plain;
	}
	
	

	
	public String decrypt(String cipherText) throws Exception {
		validateText(cipherText);
		return transform(false, cipherText);
	}
	
	
	private char getDecryptedCharacter(char key, char cipher) {
		
		for (int col = 0; col < TABULA_RECTA[0].length; col++ )
		{
			if(TABULA_RECTA[0][col] == key)
			{
				for (int row = 0; row < TABULA_RECTA.length; row++) 
				{
					if (TABULA_RECTA[row][col] == cipher)
					{
						return TABULA_RECTA[row][0];
					}
				}
			}
		}
		
		return cipher;
	}
	
	
	
	private String transform(boolean encrypt, String s) {
		StringBuilder sb = new StringBuilder();
		
		if (encrypt)
		{
			for (int i = 0; i < s.length(); i++) {
				sb.append(getEncryptedCharacter(key[i % key.length], s.charAt(i)));
				
			}
			
			return sb.toString();
		}
		else
		{
			for (int i = 0; i < s.length(); i++) {
				sb.append(getDecryptedCharacter(key[i % key.length], s.charAt(i)));
			}
		
			return sb.toString();
		}
	}
	
	
	
	
	
	private static final char[][] TABULA_RECTA = { 
			{'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'},
			{'B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','A'},
			{'C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','A','B'},
			{'D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','A','B','C'},
			{'E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','A','B','C','D'},
			{'F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','A','B','C','D','E'},
			{'G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','A','B','C','D','E','F'},
			{'H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','A','B','C','D','E','F','G'},
			{'I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','A','B','C','D','E','F','G','H'},
			{'J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','A','B','C','D','E','F','G','H','I'},
			{'K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','A','B','C','D','E','F','G','H','I','J'},
			{'L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','A','B','C','D','E','F','G','H','I','J','K'},
			{'M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','A','B','C','D','E','F','G','H','I','J','K','L'},
			{'N','O','P','Q','R','S','T','U','V','W','X','Y','Z','A','B','C','D','E','F','G','H','I','J','K','L','M'},
			{'O','P','Q','R','S','T','U','V','W','X','Y','Z','A','B','C','D','E','F','G','H','I','J','K','L','M','N'},
			{'P','Q','R','S','T','U','V','W','X','Y','Z','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O'},
			{'Q','R','S','T','U','V','W','X','Y','Z','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P'},
			{'R','S','T','U','V','W','X','Y','Z','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q'},
			{'S','T','U','V','W','X','Y','Z','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R'},
			{'T','U','V','W','X','Y','Z','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S'},
			{'U','V','W','X','Y','Z','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T'},
			{'V','W','X','Y','Z','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U'},
			{'W','X','Y','Z','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V'},
			{'X','Y','Z','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W'},
			{'Y','Z','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X'},
			{'Z','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y'}
		};
	
}

package ie.atu.sw;

public class OneTimePad {
	private String key;
	
	void setKey(String key) {
		this.key = key;
	}
	
	String encrypt(String message) {
		String encryptedText;
		StringBuilder sb = new StringBuilder();
		

		for (int i = 0; i < message.length(); i++)
		{
			int ecrypt = message.charAt(i) ^ key.charAt(i % key.length());
			char character = (char) ecrypt;
			
			sb.append(character);

		}
		
		encryptedText = sb.toString();
		return encryptedText;
	}
	
	
	String decode(String message) {
		String decodeText;
		StringBuilder sb = new StringBuilder();
		

		for (int i = 0; i < message.length(); i++)
		{
			int decodeInt = message.charAt(i) ^ key.charAt(i % key.length());
			char character = (char) decodeInt;
			
			sb.append(character);

		}
		
		decodeText = sb.toString();
		return decodeText;
	}
	
	
	public static void main(String[] args) {
		
		OneTimePad pad = new OneTimePad();
		pad.setKey("jamiebuick");
		String returnedMessage = pad.encrypt("Hello there jamie");
		String decodeMessage = pad.decode(returnedMessage);
		
		System.out.println("Encrypted Message: " + returnedMessage);
		System.out.println("Decode Message: " + decodeMessage);
	}
	
	
}

package ie.atu.sw;

public class Runner {
	
	
	public static void main(String[] args) {
		
		byte b = 65;			// 8 bits in a byte.
		int i = b;				// An int is 32 bits, my byte 'b' is only 8 bits therefore there is 24 left.
		float f = i;			// This is ok as float has 32 bits, the same as int, although float has 7-9 decimal places.	
		long l = (long) f;		// A long is 64 bits but float is 32 bits but it has precision, therefore it needs to be converted.
		double d = l; 			// A 64 bit decimal number has precision of 16-19 decimal places.
		char c = (char) d;		// A char has 16 bits, it needs to be converted. We take the 16 most important bits and dump the rest.
		
		
		System.out.println("Result: " + c);		
		//c++;					// This is the standard add 1 to its self found in C.
		c = (char) (c + 24);
				
		System.out.println("Result: " + c);
		
		System.out.println(Integer.toBinaryString(Float.floatToRawIntBits(f)));
		
		
	}

}

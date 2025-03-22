package ie.atu.sw;

public class Ex7_2 {

	public static void main(String[] args) {
		loop(10);
	}
	
	public static void loop(int n) {
		int i = n;
		while(i > 0) {
			System.out.println(i);
			if(i%2 == 0) {
				i = i/2;
			}
			else 
			{
				i = i+1;
			}
		}
	
	}
}

/*
 * 1  -  n = 10  , i = 5
 * 2  -  n = 10  , i = 6
 * 3  -  n = 10  , i = 3
 * 4  -  n = 10  , i = 4
 * 5  -  n = 10  , i = 2
 * 6  -  n = 10  , i = 1
 * 7  -  n = 10  , i = 2
 * 8  -  n = 10  , i = 1
 * 9  -  n = 10  , i = 2
 * 10 -  n = 10  , i = 1
 * 
 */

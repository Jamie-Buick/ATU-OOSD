package ie.atu.sw;

public class Narf {

	public static void zoop(String fred, int bob) {
		System.out.println(fred);
		if (bob == 5) {
			ping("not ");
		}
		else
		{
			System.out.println("!");
		}
	}
	
	public static void main(String[] args) {
		
		int bizz = 5;
		int buzz = 2;
		zoop("just for", bizz);
		clink(2*buzz);
	}
	
	public static void clink(int fork) {
		System.out.println("It's ");
		zoop("breakfast ", fork);
	}
	
	public static void ping(String strangStrung) {
		System.out.println("any " + strangStrung + "more ");
	}
	
	
}

/* 
 * Output
 * 
 * just for 
 * any not more
 * It's 
 * breakfast 
 * !
 */
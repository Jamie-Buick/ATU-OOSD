package ie.atu.sw;

public class AckermanEx {
	
	public static int ack(int m, int n) {
		int a = 1;
		
		if(m == 0)
		{
			a = n + 1;
		}
		else if(m > 0 && n == 0)
		{
			a = ack(m-1, 1);
		}
		else if (m > 0 && n > 0)
		{
			a = ack(m-1, ack(m,n-1));
		}
		
		return a;
	}
	
	public static void main(String[] args) {
		System.out.println(ack(1,2));
		
	}

}

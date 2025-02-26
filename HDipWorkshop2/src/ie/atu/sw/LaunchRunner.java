package ie.atu.sw;

import java.time.LocalDate;

public class LaunchRunner {

	
	public static void main(String[] args) {
		// Type <id> = <legal value>
		var physics = new Homework("Physics", LocalDate.of(2025, 2, 27)); // new instance of Homework, constructing!!!
		
		
		String sub = physics.getSubject();
		System.out.println(sub);
		
		physics.setComplete();
		
		
		
		/*
		Homework hw1 = new Homework(); // new instance of Homework
		// hw and hw1 have two different identifiers. The new keyworks creates a new object called hw or hw1 etc...
		System.out.println(hw1);
		System.out.println(System.identityHashCode(hw));
		System.out.println(Integer.toHexString(System.identityHashCode(hw)));
		*/
	}
}

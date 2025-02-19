package ie.atu.sw;

import java.time.LocalDate;

public class Runner {

	public static void main(String[] args) {
		/*
		 *  The new keyword creates an instance of a class. An
		 *  instance of a class is called an object.
		 */
		Student s = new Student(); // use the new keyword against a constructor
		System.out.println("Student from Runner: " + s);
		
		// Use the dot notation to access features
		s.setSid(9999);
		s.setName("Jamie Buick"); 
		s.setDob(LocalDate.now());
		
		
		// I can also use the dot notation to invoke methods
		s.setRegistered(true);
		
		String msg  = s.study(2.25d, 8);
		System.out.println(msg);
		
		boolean res = s.execute("Study please...!");
		System.out.println("Has Prefix: " + res);
		
		// Access the state
		System.out.println(s.getSid());
		System.out.println(s.getName());
		System.out.println(s.getDob());
		System.out.println(s.isRegistered());
	}
}

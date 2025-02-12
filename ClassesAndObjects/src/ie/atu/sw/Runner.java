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
		s.sid = 99999;
		s.name = "Jamie Buick";
		s.dob = LocalDate.now();
		
		
		// I can also use the dot notation to invoke methods
		s.register();
		s.study();
		s.execute();
		
		// Access the state
		System.out.println(s.sid);
		System.out.println(s.name);
		System.out.println(s.dob);
		System.out.println(s.registered);
	}
}

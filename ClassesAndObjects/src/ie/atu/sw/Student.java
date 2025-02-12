package ie.atu.sw;

import java.time.LocalDate;


public class Student {
/*
 * Define some state for the class Student. These are
 * all **instance variables**
 */
	
	public long sid;
	public String name = "Undefined";
	public LocalDate dob;				//LocalDate seems to be more up to date than util.
	public boolean registered = false;
	
	public Student() {
		System.out.println("The ID of Student the Object is " + this);
	}
	
	// Add some methods - things a class can **do** (behaviours)
	public void register() {
		this.registered = true;
	}
	
	public void study() {
		System.out.println("Studying...");
	}
	
	public void execute() {
		System.out.println("Execute");
	}
	
}

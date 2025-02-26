package ie.atu.sw;

import java.time.LocalDate;  //ctrl shift o - automatically imports this once I use LocalDate below

/*
   1) Identity => 4517d9a3 or 372f7a8d
   2) State
   3) Behaviour
 */
	
	
	
	

public class Homework {

	// Define some state for the class. Stuff that the class knows...
	private String subject;
	private LocalDate date;
	private double done = 0.99d;
	
	
	public Homework(String sub, LocalDate due) {   // constructor 
		// this means me, current object
		this.subject = sub;
		this.date = due;
		
		System.out.println(this);
	}
	
	//<viz> <return> <name> 
	public String getSubject() {
		return subject;
	}
	
	public void setComplete() {
		this.done = 0.01d;
		//System.out.println(this.done);
	}
}














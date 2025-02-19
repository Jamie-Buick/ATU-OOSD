package ie.atu.sw;

import java.time.LocalDate;

public class Student {
	/*
	 * Define some state for the class Student. These are all **instance variables**
	 */

	private long sid;
	private String name = "Undefined";
	private LocalDate dob; // LocalDate seems to be more up to date than util.
	private boolean registered = false;

	public Student() {
		System.out.println("The ID of Student the Object is " + this);
	}

	public long getSid() {
		return sid;
	}

	public void setSid(long sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public boolean isRegistered() {
		return registered;
	}

	public void setRegistered(boolean reg) {
		this.registered = reg;
	}

	// Add some methods - things a class can **do** (behaviours)

	protected String study(double hours, int level) {
		double total = hours * level;
		String message = "Studying.. " + total;

		return message;
	}

	protected boolean execute(String command) {
		System.out.println("Execute " + command);
		
		return command.endsWith("!");
		
		
	}

}

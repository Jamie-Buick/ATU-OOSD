package ie.atu.sw;

import static java.lang.System.out;

import java.time.LocalDate;
import java.util.Scanner;

public class Menu {
	private StudentManager sm = new StudentManager();
	private Scanner s;
	private boolean keepRunning = true;
	public Menu() {
		s = new Scanner(System.in);
	}
	
	
	public void start() {
		while(keepRunning)
		{
			showOptions();
			
			int choice = Integer.parseInt(s.next()); // program hangs here until user enters a choice
			
			switch(choice) 
			{
				case 1  -> add();
				case 2  -> delete();
				case 3  -> findByID();
				case 4  -> findStudentsByFirstname();
				case 5  -> getTotal();
				case 6  -> keepRunning = false;
				default -> out.println("[Error] Invalid Selection");
			}
		}
		out.println("[INFO] Exiting.......");
	}
	
	
	
	private void add() {
		out.println("[INFO] Add a Student");
		
		out.println("Enter an Student ID> ");
		String sid = s.next();
		
		out.println("Enter an Student Firstname> ");
		String fname = s.next();
		
		out.println("Enter an Student Surname> ");
		String surname = s.next();
		
		Student tmp = new Student(sid, fname, surname, LocalDate.now(), 
				new Address("Louth"), Course.SOFT_DEV);
		sm.add(tmp);
		
	
	}
	
	private void delete() {
		out.println("Enter an Student ID> ");
		String sid = s.next();
		
		if (sm.delete(sid)) {
			out.println("[INFO] Student " + sid + " Deleted!");
		}
		else
		{
			out.println("[INFO] Cannot find student " + sid);
		}
	}
	
	
	private void findByID() {
		out.println("[INFO] Find Student by ID");
		out.println("Enter an Student ID> ");
		String sid = s.next();
		Student student = sm.getStudentByID(sid);
		
		if (student != null)
		{
			out.println(student);
		}
		else
		{
			out.println("[INFO] Cannot find student " + sid);
		}

	}
	
	private void findStudentsByFirstname() {
		out.println("[INFO] Find Students by Firstname");
		out.println("Enter a student firstname> ");
		String fName = s.next();
		
		Student[] results = sm.getStudentsByFirstname(fName);
		
		for (Student student : results) 
		{
			out.println(student);
		}
	}
	
	private void getTotal() {
		out.println("Total Students: " + sm.size());

	}
	
	
	
	private void showOptions() {
		
		out.println("***************************************************");
		out.println("**             Student Manager 1.0               **");
		out.println("***************************************************");
		out.println("(1) Add a Student");
		out.println("(2) Delete a Student");
		out.println("(3) Find Student by ID");
		out.println("(4) Find Students by Firstname");
		out.println("(5) Get Total Student Number");
		out.println("(6) Quit");
		out.println("Select an Option [1-6]>");
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}

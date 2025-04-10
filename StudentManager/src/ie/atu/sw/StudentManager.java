package ie.atu.sw;

import java.time.LocalDate;
import java.util.concurrent.ThreadLocalRandom;

public class StudentManager {
	private static final int INITIAL_CAPACITY = 10;
	private Student[] student = null;
	
	
	
	public StudentManager() {
		student = new Student[INITIAL_CAPACITY];
		init();
	}


	public void add(Student s) {
		for (int i = 0; i < student.length; i++) {
			if (student[i] == null)
			{
				student[i] = s;
				return;
			}
		}
		
		int index = getExpandedIndex();
		student[index] = s;
	}
	
	private int getExpandedIndex() {
		Student[] temp = new Student[student.length * 2];
		
	
		for (int i = 0; i < student.length; i++) {
			temp[i] = student[i];
		}
		
		int index = student.length;
		student = temp;
		return index;
	}
	
	
	public boolean delete(String sid) {
		for (int i = 0; i < student.length; i++) {
			if (student[i] != null && student[i].sid().equals(sid))
			{
				student[i] = null;
				return true;
			}
		}
		return false;
	}
	
	
	public Student getStudentByID(String sid) {
		for (int i = 0; i < student.length; i++) {
			if (student[i] != null && student[i].sid().equals(sid))
			{
				return student[i];
			}
		}
		return null;
	}
	
	
	public Student[] getStudentsByFirstname(String firstname) {
		// Count the number of matches and create an array of the right size
		int matches = 0;
		for (int i = 0; i < student.length; i++) {
			if (student[i] != null && student[i].firstname().equals(firstname))
			{
				matches++;
			}
		}
		
		
		// Copy all of the matches into a new array
		Student[] temp = new Student[matches];
		int index = 0;
		for (int i = 0; i < student.length; i++) {
			if (student[i] != null && student[i].firstname().equals(firstname)) 
			{
				temp[index] = student[i];
				index++;
			}
			
		}
		
		return temp;
	}
	
	
	public int size() {
		int total = 0;
		for (int i = 0; i < student.length; i++) {
			if (student[i] != null)
			{
				total++;
			}
		}
		return total;
	}
	
	
	private void init() {
		
		ThreadLocalRandom rand = ThreadLocalRandom.current();
		
		String[] fnames = {"Joe", "Jane", "Anne", "Pat"};
		String[] surnames = {"Smith", "Murphy", "Buick", "Burke"};
		Course[] courses = Course.values();
		
		
		int max = 100000;
		long start = System.currentTimeMillis();
		
		for(int i = 0; i < max; i++) {
			Student rs = new Student("G00" + i, 
					fnames[rand.nextInt(0, fnames.length)],
					surnames[rand.nextInt(0, surnames.length)],
					LocalDate.now(),
					new Address("Galway"), 
					courses[rand.nextInt(0, courses.length)]
				);
			add(rs);

		}
		System.out.println("Time: " + (System.currentTimeMillis() - start));
	}
	
	
	
}






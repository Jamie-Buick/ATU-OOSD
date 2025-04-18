package ie.atu.sw;

public enum Course {
	
	SOFT_DEV 	("Software Development" , "Computing"),
	DATA_ANA 	("Data Analytics" , "Computing"), 
	WEB_DEV 	("Web Application Development" , "Computing"), 
	CHEM 		("Chemisty" , "Science"), 
	PHYS 		("Physics" , "Science"), 
	MEDI 		("Medicine" , "Medicine"), 
	ACC 		("Accounting" , "Commerce");

	private final String cname;
	private final String cfaculty;
	
	Course(String name, String faculty) {
		this.cname = name;
		this.cfaculty = faculty;
	}
	
	
	public String getCoursename() {
		return cname;
	}
	
	public String getFaculty() {
		return cfaculty;
	}
	

}

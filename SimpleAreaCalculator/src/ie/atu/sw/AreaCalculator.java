package ie.atu.sw;

import java.util.Scanner;

public class AreaCalculator {
	
	//Instance variables
	private Scanner scanner;
	
	public AreaCalculator() {
		scanner = new Scanner(System.in);
		
		init();
		processInput();
	}
	
	public void calcAreaCircle() {
		System.out.println("Please enter the radius>");
		String input = scanner.next();
		double radius = Double.parseDouble(input);
		double area = Math.PI * Math.pow(radius,2);
		System.out.println("Area of circle: " + area);
	}
	
	public void calcAreaTriangle() {
		System.out.println("Please enter the base>");
		String inputBase = scanner.next();
		System.out.println("Please enter the Height>");
		String inputHeight = scanner.next();
		
		double base = Double.parseDouble(inputBase);
		double height = Double.parseDouble(inputHeight);
		
		
		double area = 0.5 * base * height;
		System.out.println("Area of triangle: " + area);
	}
	
	
	
	public void processInput() {
		String option = scanner.next();
		int choice = Integer.parseInt(option);
		//System.out.println(choice);
		
		if (choice == 1) {
			calcAreaCircle();
		} 
		else if(choice == 2){
			calcAreaTriangle();
		}
		else if(choice == 3){
			System.exit(0);
		}
		else {
			System.out.println("Please enter a valid selection");
		}
	}
	
	
	private void init() {
		System.out.println("-------------------------------------------------");
		System.out.println("\t\tSimple Area Calculator");
		System.out.println("-------------------------------------------------");
		System.out.println("(1) Area of a Cirlce");
		System.out.println("(2) Area of a Triangle");
		System.out.println("(3) Quit");
		System.out.println("Select [1-3]>");
		//System.out.println("");
		
	}
	
	public static void main(String[] args) {
		
		new AreaCalculator();
		
	}

}

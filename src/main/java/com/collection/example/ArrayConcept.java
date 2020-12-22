package com.collection.example;

public class ArrayConcept {
	
	/* # What is array or static array?
	 * # What is the lowest index of array?
	 * # What is the height index of array?
	 * # Which method will give you the size of the array?
	 * # Give me some limitation of array?
	 * # What is object static array?
	 * # Static array vs Dynamic array
	 */

	public static void main(String[] args) {
		
		int num = 10; // simple variable
		System.out.println(num);
		
		// int type array
		System.out.println("Example of "+"int"+" Array");
		
		int num1[] = new int[10]; 
		num1[0] = 10;
		num1[1] = 20;
		num1[2] = 30;
		
		System.out.println(num1[1]);
		
		num1[3] = 40;
		num1[4] = 50;
		num1[5] = 60;
		
		for (int i = 0; i < num1.length; i++) {
			System.out.println(num1[i]);
		}
		

		// double type array
		System.out.println("Example of "+"double"+" Array");
		
		double number = 10.5;	// regular variable
		System.out.println(number);
		
		double number1[] = new double[5];
		number1[0] = 10.25;
		number1[1] = 30;
		number1[2] = 25.25;
		
		for (int i = 0; i < number1.length; i++) {
			System.out.println(number1[i]);
		}
		
		// string array
		System.out.println("Example of "+"String"+" Array");
		
		String name = "Ashik";
		System.out.println(name);
		
		String students[] = new String[10];
		students[0] = "Talha";
		students[1] = "Sohel";
		students[2] = "Rana";
		students[3] = "Ashraf";
		
		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
		}
		
		// object array
		System.out.println("Example of "+"Object"+" Array");
		
		Object employee[] = new Object[10];
		employee[0] = "Name = Md A Rahman";
		employee[1] = "Age = 35 years";
		employee[2] = "Contact = 345 567 7890";
		employee[3] = "Salary = 35.25 ";
		employee[4] = "Abu Talha";
		employee[5] = 31;
		employee[6] = 1343454567;
		employee[7] = 31.75;
		
		for (int i = 0; i < employee.length; i++) {
			System.out.println(employee[i]);
		}
	}

}

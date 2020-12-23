package com.oop.concepts;

import java.util.ArrayList;
import java.util.List;

public class MethodConcept {
	
	/* # What is method in java?
	 * # What are the type of method in java?
	 * # What is return in Java?
	 * # What is Object in java?
	 */

	public static void main(String[] args) {
		
		MethodConcept objectConcept = new MethodConcept();
		
		objectConcept.test();
		objectConcept.print();
		objectConcept.sum();
		objectConcept.sum1();
		objectConcept.getStudentName();
		objectConcept.studentList();
		

	}
	
	public void test() {
		System.out.println("This is Method !");
		
	}
	
	public void print() {
		System.out.println("Hello Bangladesh !");
	}
	
	public void sum() {
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println("Sum of a and b is = "+c);
		
	}

	public int sum1() {
		int a1 = 1010;
		int b1 = 2020;
		int c1 = a1+b1;
		System.out.println("Sum of a1 and b1 is = "+c1);
		return c1;
		
	}
	
	public String[] getStudentName() {
		String student[] = new String[10];
		student[0] = "Md Rahman";
		student[1] = "Abu Talha";
		student[2] = "Mohammed Rahman";
		
		for (int s = 0; s < student.length; s++) {
			System.out.println(student[s]);
		}
		return student;
		
	}
	
	public void studentList() {
		
		List<String> list = new ArrayList<String>();
		list.add("Md Rahman");
		list.add("Abu Talha");
		list.add("Sohel Ahmed");
		
		
		System.out.println(list);
		
		
	}
}

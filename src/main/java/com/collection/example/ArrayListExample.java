package com.collection.example;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		
		
		// array or static array
		String student[] = new String[5];
		student[0] = "Md A Mian";
		student[1] = "Md A Rahman";
		student[2] = "Md s Ahmed";
		
		
		for (int i = 0; i < student.length; i++) {
			System.out.println(student[i]);
		}
		System.out.println(" ");
		
		student[3] = "Md M Islam";
		student[4] = "Shafiqul Islam";
		for (int i = 0; i < student.length; i++) {
			System.out.println(student[i]);
		}
		
		// We can declare, instantiate and initialize the java array together
		
		int num[]= {55,83,73};
		
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		
		System.out.println("Length of num array is :"+num.length);
		/*
		num[3]=77;
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		 it will not give you compile time error but it will through an exception
		 call ArrayIndexOutOfBoundsException
		*/
		
		// We can also print the Java array using for-each loop
		
		int num2[] = new int[5];
		num2[0]= 65;
		num2[1]= 87;
		num2[2]= 59;
		num2[3]= 69;
		num2[4]= 79;
		
		for(int i:num2) {
			System.out.println(i);
		}
		
		
		
		// ArrayList
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(93);
		numbers.add(63);
		numbers.add(81);
		numbers.add(79);
		numbers.add(67);
		
		System.out.println("The list of numbers are : "+numbers);
		
		// clear() method => It is used to remove all of the elements from this list.
		numbers.clear();
		System.out.println("The list of numbers are : "+numbers);
		
		// addAll() =>
		ArrayList<String> studentName = new ArrayList<String>();
		studentName.add("Md Rahman");
		studentName.add("Abu Hayder");
		studentName.add("Md M Islam");
		
		System.out.println(studentName);
		
		studentName.add(1, "Monirul Islam");
		System.out.println(studentName);		
		
	}

}

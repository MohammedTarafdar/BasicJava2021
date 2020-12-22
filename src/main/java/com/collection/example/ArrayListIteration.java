package com.collection.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListIteration {

	public static void main(String[] args) {
		
		/* There are four ways to loop ArrayList:
		 * 		For Loop
		 * 		Advanced for loop
		 * 		While Loop
		 * 		Iterator
		 */
		
		List <String> student= new ArrayList<String>();
		student.add("Sohel");
		student.add("Najmul");
		student.add("Arif");
		
		// with for loop
		
		for (int i = 0; i < student.size(); i++) {
				System.out.println(student.get(i));
		}
		
		// with advanced for loop or for each loop
		System.out.println(" ");
		for(String stu : student) {
			System.out.println(stu);
		}
		
		
		
		// Looping Array List using Iterator
		
		System.out.println(" ");
		Iterator<String> iterator = student.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}

	}

}

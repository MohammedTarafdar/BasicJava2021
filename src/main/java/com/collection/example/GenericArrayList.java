package com.collection.example;

import java.util.ArrayList;
import java.util.List;

public class GenericArrayList {

	public static void main(String[] args) {
		
		// Non-generic
		
		List list = new ArrayList();
		list.add("Talha");
		list.add(97);
		list.add('A');
		list.add(87.50);
		list.add(true);
		
		System.out.println("This is non-generic array list : "+list);
		
		
		//What is Generic ArrayList?
		// => Generics means parameterized types.
		
		List<Object> commonList = new ArrayList<Object>();
		commonList.add("Talha");
		commonList.add(97);
		commonList.add('A');
		commonList.add(87.50);
		commonList.add(true);
		
		System.out.println(" ");
		System.out.println("This is object type generic array list : "+commonList);
		
		
		List <String> student= new ArrayList<String>();
		student.add("Sohel");
		student.add("Najmul");
		student.add("Arif");
		
		System.out.println(" ");
		System.out.println("This is string type generic array list : "+student);
		
		List<Integer> number = new ArrayList<Integer>();
		number.add(0, 100);
		number.add(1, 170);
		number.add(2, 90);
		
		System.out.println(" ");
		System.out.println("This is integer type generic array list : "+number);
	}

}

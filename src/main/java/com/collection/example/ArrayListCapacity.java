package com.collection.example;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCapacity {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		
		System.out.println("The size of array list is : "+list.size());
		
		list.add(200);
		
		System.out.println(" ");
		System.out.println("The size of array list is : "+list.size());
		
		/*
		 * How do you identyfy vertual capacity of ArrayList?
		 * => The initial virtual capacity of ArrayList is 10. There is no method 
		 * for that but we can see by debugging ArrayList.
		 * 
		 * .size() => method will return the physical capacity of ArrayList
		 */
		

	}

}

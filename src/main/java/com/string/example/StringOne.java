package com.string.example;

public class StringOne {
	
	public static void main(String[] args) {
		
		// startWith() and endWith()
		String name = "Mohammed Ashikur Rahman Tarafdar";
		Boolean status = name.startsWith("Mohammed");
		System.out.println(status);
		
		Boolean status2 = name.endsWith("Tarafdar");
		System.out.println(status2);
		
		// equals() and equalsIgnoreCase()
		
		String actual= "Mohammed Ashikur Rahman Tarafdar";
		String expected = "mohammed ashikur rahman tarafdar";
		
		Boolean status3= actual.equals(expected);
		System.out.println(status3);
		
		Boolean status4= actual.equalsIgnoreCase(expected);
		System.out.println(status4);
		
		// contains() => will return true/false
		Boolean status5 = actual.contains("Mohammed");
		System.out.println(status5);
				
		// split(expression) => will return array of String
		String toolsName = "Selenium-Postman-QTP";
		String [] spToolsName = toolsName.split("-");
		for (int  i= 0;  i< spToolsName.length; i++) {
			System.out.println(spToolsName[i]);
		}
		
		// trim() => eliminates white spaces before and after string
		String fulName = " Mohammed A R Tarafdar     ";
		int lengthOfFulName = fulName.length();
		System.out.println(lengthOfFulName);
		
		String newFulName = fulName.trim();
		System.out.println(newFulName);
		System.out.println(newFulName.length());
		
		// charAt() => returns a character at specific index
		char positionOfChar = newFulName.charAt(15);
		System.out.println(positionOfChar);
		
		
	}

}

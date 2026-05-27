package com.jUnitDemo.jUnit5;

public class App {
	
	public int divide(int num1, int num2) {
		return num1 / num2;
	}
	public int multiply(int num1, int num2) {
		return num1 * num2;
	}

	public String reverseString(String str) {
		String reverse = ""; 
		
		for(int i = str.length() - 1; i >=0; i--) {
			reverse += str.charAt(i); 
		}
		return reverse; 
	}
	
	
	public static void main(String[] args) {
		App calc = new App(); 
		
		int result = calc.divide(8, 4); 
		if(result == 2)
			System.out.println("Test case Passed");
		else 
			System.out.println("Test case failed");
		
		
		String r = calc.reverseString("Soham"); 
		
		System.out.println(r);
	}
}

package com.test;

public class FactorialNumber {
	
	public static void main(String[] args) {
		int inputNumber = 5;
		int factorialNumber = 1;
		
		for (int i = inputNumber; i > 0; i--) {
			factorialNumber = factorialNumber*i;
		}
		System.out.println("Factorial of 5 is " + factorialNumber);
	}

}

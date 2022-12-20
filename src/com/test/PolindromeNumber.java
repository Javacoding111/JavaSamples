package com.test;

import java.util.Scanner;

public class PolindromeNumber {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  //123
		int inputNumber = sc.nextInt();
		
		int originalNumber = inputNumber;
		
		int reversedNumber=0;
		
		while(inputNumber != 0) {
			
			int reminder = inputNumber%10;
			reversedNumber = reversedNumber*10+reminder;
			inputNumber = inputNumber/10;
			
		}
		if(originalNumber == reversedNumber) {
			System.out.println("Given number is Polindrome Number");
		}  else {
			System.out.println("Given number is not a Polindrome Number");
		}
	}
	
	

}

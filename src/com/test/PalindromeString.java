package com.test;

import java.util.Scanner;

public class PalindromeString {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  //liril, radar, madam are polindrome strings
		String inputString = sc.next();
		
		String originalString = inputString;
		String reverseString = "";
		
		for (int i = originalString.length()-1 ; i >= 0; i--) {
			reverseString = reverseString+  originalString.charAt(i);
		}
		if(originalString.equals(reverseString)) {
			System.out.println("Given String is Palindrome String");
		} else {
			System.out.println("Given String is not a  Palindrome String");
		}
	}

}

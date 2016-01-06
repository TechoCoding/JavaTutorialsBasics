package com.hastimal.basic.examples;

import java.util.Scanner;

public class PalindromeStringCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean t= true;
		while(t==true){     //Make infinite loop
			String reverseString="";
			Scanner sc = new Scanner(System.in);

			System.out.println("Enter a string to check if it is a palindrome:");
			String inputString = sc.nextLine();

			for (int i = (inputString.length()-1); i >=0; i--) {

				reverseString=reverseString+inputString.charAt(i);
			}

			if (inputString.equals(reverseString))
				System.out.println("Input string is a palindrome.");
			else
				System.out.println("Input string is not a palindrome.");


		}

	}

	/**
	 * @param b
	 */
	private static void While(boolean b) {
		// TODO Auto-generated method stub

	}

}

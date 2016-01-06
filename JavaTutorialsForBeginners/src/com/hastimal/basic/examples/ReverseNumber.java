package com.hastimal.basic.examples;

import java.util.Scanner;

/**
 * @author hastimal
 *
 * Created by hastimal jangid @ Dec 31, 2015 
 * ReverseNumber.java
 * 
 * Reverse a number using while Loop
 */
public class ReverseNumber {
	public ReverseNumber() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		int num =0, reversenum=0;
		System.out.println("Enter a number which you wants to reverse");
		Scanner in= new Scanner(System.in);
		num = in.nextInt();

		//While Loop: Logic to find out the reverse number
		while (num!=0) {
			reversenum= reversenum*10;
			reversenum=reversenum+num%10;
			num =num/10;
		}

		System.out.println("Reverse of input number is: "+reversenum);


	}
}


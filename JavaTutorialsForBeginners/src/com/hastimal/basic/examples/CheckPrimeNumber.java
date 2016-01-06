/**
 * Program to see number is prime  or not
 */
package com.hastimal.basic.examples;

import java.util.Scanner;

/**
 * @author hastimal
 *
 * Created by hastimal jangid @ Jan 6, 2016 
 * CheckPrimeNumber.java
 */
public class CheckPrimeNumber {

	public static void main(String[] args) {
		boolean isPrime=true;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number for check:");
		//capture the input in an integer
		int num=input.nextInt();
		for (int i = 2; i < num; i++) {
			int temp= num%i;
			if(temp==0){
				isPrime=false;
				break;
			}
		}

		//If isPrime is true then the number is prime else not
		if(isPrime)
			System.out.println(num + " is Prime Number");
		else
			System.out.println(num + " is not Prime Number");

	}



}

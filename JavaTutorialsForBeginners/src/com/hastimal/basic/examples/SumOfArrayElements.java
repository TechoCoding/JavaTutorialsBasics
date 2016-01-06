package com.hastimal.basic.examples;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfArrayElements {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter how many numbers want to enter in array");
		int n= input.nextInt();
		
		int array[] = new int[n]; 
		System.out.println("Enter "+n+"  numbers now");
		for (int i = 0; i < array.length; i++) {
			array[i]=input.nextInt();
		}
		
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum=sum+array[i];
		}
		System.out.println("Sum of array elements is:"+sum);
		System.out.println("Avg of elements is:"+sum/(array.length));
		
		Arrays.sort(array);
		System.out.println("Sorted array is ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(" "+array[i]);
		}
		System.out.println("Max elements is:"+array[n-1]);
		System.out.println("Min elements is:"+array[0]);
		
		
	}

}

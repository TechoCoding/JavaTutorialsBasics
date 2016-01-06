package com.hastimal.basic.examples;

import java.util.Scanner;

public class AreaCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter radius of circle");
		Scanner in= new Scanner(System.in);
		double r = in.nextDouble();
		System.out.println("Area of circle with radius "+r+" is "+CircleAreaCalculation(r));

		System.out.println("Enter length of triangle");
		double l = in.nextDouble();  
		System.out.println("Enter beadth of triangle");
		double b = in.nextDouble();  
		System.out.println("Area of Triangle with length "+l+" and breadth"+b+" is "+TriangleAreaCalculation(l,b));

	}

	/**
	 * @param l
	 * @param b
	 */
	private static double TriangleAreaCalculation(double l, double b) {

		//Area = (width*height)/2
		double area = (l* b)/2;

		return area;

	}

	/**
	 * @param r
	 */
	private static double CircleAreaCalculation(double r) {

		double area = Math.PI * (r * r);
		//Circumference = 2*PI*radius
		return area;

	}

}

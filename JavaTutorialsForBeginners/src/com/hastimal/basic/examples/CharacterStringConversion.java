package com.hastimal.basic.examples;
//to convert char to string and vice versa
public class CharacterStringConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringToChar();
		CharToString();

	}

	/**
	 * 
	 */
	private static void CharToString() {
		// TODO Auto-generated method stub
	      // Method 1: Using String object
	      char[] ch = {'h', 'a', 's', 't', 't', 'm', 'a', 'l', ' ', 'j', 'a', 'n','g','i','d'};
	      String str = new String(ch);
	      System.out.println(str);
	 
	      // Method 2: Using valueOf method
	      String str2 = String.valueOf(ch);
	      System.out.println(str2);

	}

	/**
	 * 
	 */
	private static void StringToChar() {
		// TODO Auto-generated method stub
		String str ="hastimal jangid";
		for (int i = 0; i < str.length(); i++) {
			char ch =str.charAt(i);
			System.out.println("Character at position "+i+1+" is "+ch);
		}
		
	}

}

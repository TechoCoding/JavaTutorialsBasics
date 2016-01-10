package com.hastimal.searching;
/**
 * Input: Number of elements, element's values, value to be searched
 * Output:Position of the number input by user among other numbers*/

import java.util.Arrays;
import java.util.Scanner;

public class SearchLinearBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of elements:");
		int size = input.nextInt(); 
		int[] array= new int[size];
		//Loop to store each numbers in array
		System.out.println("Enter all elements:");
		for (int i = 0; i < array.length; i++) {
			array[i]=input.nextInt();
		}
		System.out.println("Enter number to be searched:");
		int item = input.nextInt(); 
		
		System.out.println("###BINARY SEARCH BY JAVA DEFAULT###");
		System.out.println(item + " found at location " + (Arrays.binarySearch(array, item) + 1) + ".");
		
		System.out.println("###LINEAR SEARCH###");
		LinearSearch(array,item);
		//For binary search
				
		int first=0, last=array.length-1;
		
		Arrays.sort(array);
		System.out.print("Sorted are ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(" "+array[i]);
		}
		System.out.println();
		System.out.println("###BinarySearchNonRecursive SEARCH###");
		BinarySearchNonRecursive(array,item,first,last);
		System.out.println();
		System.out.println("###BinarySearch SEARCH###");
		BinarySearchRecursive(array,item,first,last);
		
	}

	/**
	 * @param array
	 * @param item
	 * @param first
	 * @param last
	 */
	private static void BinarySearchNonRecursive(int[] array, int item,	int first, int last) {
		// TODO Auto-generated method stub
		int middle = (first + last)/2;
		while( first <= last )
		{
			if ( array[middle] < item )
				first = middle + 1;
			else if ( array[middle] == item )
			{
				System.out.println(item + " found at location " + (middle + 1) + ".");
				break;
			}
			else
			{
				last = middle - 1;
			}
			middle = (first + last)/2;
		}
		if ( first > last )
			System.out.println(item + " is not found.\n");
	}

	/**
	 * @param array
	 * @param item
	 * @param first
	 * @param last
	 * @return 
	 */
	private static int BinarySearchRecursive(int[] array, int item, int first, int last) {
		// TODO Auto-generated method stub
		// test if array is empty
		if (first > last){
			// set is empty, so return value showing not found
			System.out.println("Key not found");
			return 0;
		}
		else{
			// calculate midpoint to cut set in half
			int mid=(first+last)/2;
			if(array[mid]==item)
				return mid;
			// three-way comparison
			else if (array[mid] > item)
				// key is in lower subset
				return BinarySearchRecursive(array, item, first, mid - 1);
			else if (array[mid] < item)
				// key is in upper subset
				return BinarySearchRecursive(array, item, mid + 1, last);

		}
		return 0;
		
	}
	/**
	 * int binary_search(int A[], int key, int imin, int imax)
{
  // test if array is empty
  if (imax < imin)
    // set is empty, so return value showing not found
    return KEY_NOT_FOUND;
  else
    {
      // calculate midpoint to cut set in half
      int imid = midpoint(imin, imax);

      // three-way comparison
      if (A[imid] > key)
        // key is in lower subset
        return binary_search(A, key, imin, imid - 1);
      else if (A[imid] < key)
        // key is in upper subset
        return binary_search(A, key, imid + 1, imax);
      else
        // key has been found
        return imid;
    }
}
	 */


	/**
	 * @param array
	 * @param num
	 */
	private static void LinearSearch(int[] array, int item) {
		boolean flag =false;
		for (int i = 0; i < array.length; i++) {
			if (array[i]==item) {
				flag =true;
				System.out.println(item+" is present at location "+(i+1));
				/*Item is found so to stop the search and to come out of the 
				 * loop use break statement.*/
				break;

			}
		}
		if (flag==false)
			System.out.println(item + " doesn't exist in array.");	
	}

}

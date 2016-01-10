package com.hastimal.javacollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * A List is an ordered Collection (sometimes called a sequence). 
 * Lists may contain duplicate elements. Elements can be inserted or accessed by 
 * their position in the list, using a zero-based index.*/
/**
 * The issue with arrays is that they are of fixed length so if it is full we cannot 
 * add any more elements to it, likewise if there are number of elements gets removed 
 * from it the memory consumption would be the same as it doesn’t shrink. On the other 
 * ArrayList can dynamically grow and shrink as per the need. Apart from these benefits 
 * ArrayList class enables us to use predefined methods of it which makes our task easy. */
public class CollectionArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayListStringAddRemove();
		ArrayListIntegerAddRemove();
		ArrayListAddAllMethod();
		ArrayListSorting();
		ArrayListSize();
		ArrayListSubList();

	}

	/**
	 * 
	 */
	private static void ArrayListSubList() {
		ArrayList<String> al = new ArrayList<String>();

		//Addition of elements in ArrayList
		al.add("Steve");
		al.add("Justin");
		al.add("Ajeet");
		al.add("John");
		al.add("Arnold");
		al.add("Chaitanya");

		System.out.println("Original ArrayList Content: "+al);

		//Sublist to ArrayList
		ArrayList<String> al2 = new ArrayList<String>(al.subList(1, 4));
		System.out.println("SubList stored in ArrayList: "+al2);

		//Sublist to List
		List<String> list = al.subList(1, 4);
		System.out.println("SubList stored in List: "+list);
	}




/**
 * 
 */
private static void ArrayListSize() {
	ArrayList<Integer> al=new ArrayList<Integer>();
	System.out.println("Initial size: "+al.size());
	al.add(1);
	al.add(13);
	al.add(45);
	al.add(44);
	al.add(99);
	System.out.println("Size after few additions: "+al.size());
	al.remove(1);
	al.remove(2);
	System.out.println("Size after remove operations: "+al.size());
	System.out.println("Final ArrayList: ");
	for(int num: al){
		System.out.println(num);
	}

}

/**
 * 
 */
private static void ArrayListSorting() {
	ArrayList<Integer> arrayList= new ArrayList<Integer>();
	arrayList.add(11);
	arrayList.add(2);
	arrayList.add(7);
	arrayList.add(3);
	/* ArrayList before the sorting*/
	System.out.println("Before Sorting:");
	for (int integer : arrayList) {
		System.out.println(integer);
	}

	/* Sorting of arraylist using Collections.sort*/
	Collections.sort(arrayList);

	/* ArrayList after sorting*/
	System.out.println("After Sorting:");
	System.out.println(arrayList);
}

/**
 * 
 */
private static void ArrayListAddAllMethod() {

	// ArrayList1 
	ArrayList<String> al = new ArrayList<String>();
	al.add("Apple");
	al.add("Orange");
	al.add("Grapes");
	al.add("Mango");
	System.out.println("ArrayList1 before addAll:"+al);

	//ArrayList2 
	ArrayList<String> al2 = new ArrayList<String>();
	al2.add("Fig");
	al2.add("Pear");
	al2.add("Banana");
	al2.add("Guava");
	System.out.println("ArrayList2 content:"+al2);

	//Adding ArrayList2 in ArrayList1 at 3rd position(index =2)
	al.addAll(2, al2);
	System.out.println("ArrayList1 after adding ArrayList2 at 3rd Pos:\n"+al);


}

/**
 * 
 */
private static void ArrayListIntegerAddRemove() {
	// TODO Auto-generated method stub
	ArrayList<Integer> intObj= new ArrayList<Integer>();
	//How to add in ArrayList	
	intObj.add(11);
	intObj.add(21);
	intObj.add(31);
	intObj.add(41);
	/* Displaying array list elements */
	System.out.println("Currently the array list has following elements:"+intObj);
	intObj.remove(1);   //removing index number elements 
	System.out.println("Currently the array list has following elements:"+intObj);

}

/**
 * Creation of ArrayList in this method
 */
private static void ArrayListStringAddRemove() {
	ArrayList<String> obj= new ArrayList<String>();
	//How to add in ArrayList	
	obj.add("Ram");
	obj.add("Shyam");
	obj.add("Ghanshyam");
	obj.add("Sitaram");
	obj.add("Mohan");

	/* Displaying array list elements */
	System.out.println("Currently the array list has following elements:"+obj);

	/*Add element at the given index*/        //public void add(int index, Object element)
	obj.add(0, "Rahul");               //add at index 0 first position as starts from zero
	obj.add(1, "Jatin");				//add at index 1 first position as starts from zero

	/*Remove elements from array list like this*/
	obj.remove("Ghanshyam");
	obj.remove("Mohan");
	System.out.println("Current array list is:"+obj);
	/*Remove element from the given index*/
	obj.remove(1);

	System.out.println("Current array list is:"+obj);

}

}

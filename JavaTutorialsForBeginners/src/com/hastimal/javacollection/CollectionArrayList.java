package com.hastimal.javacollection;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

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
		ArrayListTraverseWithLoops();
		ArrayListStringAddRemove();
		ArrayListIntegerAddRemove();
		ArrayListAddAllMethod();
		ArrayListSorting();
		ArrayListSize();
		ArrayListSubList();
		ArrayListGetMethod();
		ArrayListContainsMethod();
		ArrayListCloneMethod();
		ArrayLIstAssyncToSynch();
		ArrayListSynchMethod();
		ArrayListSerialize();
		ArrayListDeSerialize();
		ArrayListSorting();

	}

	/**
	 * De-Serialization:In this class we are retrieving the stream of bytes from myfile which we have stored using 
	 * the above class. We are type casting the returned object to ArrayList and displaying the elements of ArrayList. 
	 * Observe the output: We are getting the same elements which we have added to the ArrayList before the serialization.
	 */
	@SuppressWarnings("unchecked")
	private static void ArrayListDeSerialize() {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		   try
	        {
	            FileInputStream fis = new FileInputStream("myfile");
	            ObjectInputStream ois = new ObjectInputStream(fis);
	            al = (ArrayList<String>) ois.readObject();
	            ois.close();
	            fis.close();
	         }catch(IOException ioe){
	             ioe.printStackTrace();
	             return;
	          }catch(ClassNotFoundException c){
	             System.out.println("Class not found");
	             c.printStackTrace();
	             return;
	          }
	        for(String tmp: al){
	            System.out.println(tmp);
	        }

		

	}

	/**
	 * ArrayList is serializable by default. 
	 * This means you need not to implement Serializable interface explicitly in order to serialize an ArrayList. 
	 * Serialization: Run the below class and it will create a file myfile which will be having ArrayList object
	 *  in form of Stream of bytes. We would be using “myfile” at the receivers end to recreate the Object from 
	 *  stream of bytes.Note: We did not implemented the Serializable interface in the below class because ArrayList is 
	 *  already been serialized by default.
	 *  
	 *  De-Serialization:In this class we are retrieving the stream of bytes from myfile which we have stored using 
	 *  the above class.We are type casting the returned object to ArrayList and displaying the elements of ArrayList
	 */
	private static void ArrayListSerialize() {
		// TODO Auto-generated method stub
		ArrayList<String> al=new ArrayList<String>();
		al.add("Hello");
		al.add("Hi");
		al.add("Howdy");

		try{
			FileOutputStream fos= new FileOutputStream("myfile");
			ObjectOutputStream oos= new ObjectOutputStream(fos);
			oos.writeObject(al);
			oos.close();
			fos.close();
		}catch(IOException ioe){
			ioe.printStackTrace();
		}
	}

	/**
	 * 
	 */
	private static void ArrayListSynchMethod() {
		// TODO Auto-generated method stub
		// CopyOnWriteArrayList is a thread-safe variant of ArrayList.

		CopyOnWriteArrayList<String> al = new CopyOnWriteArrayList<String>();

		//Adding elements to synchronized ArrayList
		al.add("Pen");
		al.add("NoteBook");
		al.add("Ink");

		System.out.println("Displaying synchronized ArrayList Elements:");
		//Synchronized block is not required in this method
		Iterator<String> iterator = al.iterator(); 
		while (iterator.hasNext())
			System.out.println(iterator.next());
	}



	/**
	 * All loops and 
	 */
	private static void ArrayListTraverseWithLoops() {
		// TODO Auto-generated method stub
		ArrayList<Integer> arrlist = new ArrayList<Integer>(2);
		arrlist.add(14);
		arrlist.add(7);
		arrlist.add(39);
		arrlist.add(40);

		/* For Loop for iterating ArrayList */
		System.out.println("For Loop");
		for (int counter = 0; counter < arrlist.size(); counter++) { 		      
			System.out.println(arrlist.get(counter)); 		
		}   		

		/* Advanced For Loop*/ 		
		System.out.println("Advanced For Loop"); 		
		for (Integer num : arrlist) { 		      
			System.out.println(num); 		
		}

		/* While Loop for iterating ArrayList*/ 		
		System.out.println("While Loop"); 		
		int count = 0; 		
		while (arrlist.size() > count) {
			System.out.println(arrlist.get(count));
			count++;
		}

		/*Looping Array List using Iterator*/
		System.out.println("Iterator");
		Iterator<Integer> iter = arrlist.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}




	/**
	 * ArrayList is Non-synch(can work on multi-threading concurrent tasks but we can convert into 
	 * Synchronous thread safe(thread-safe, the thread which works on one and lock on it which makes other thread wait till the lock is released.) 
	 * with following)
	 */
	private static void ArrayLIstAssyncToSynch() {
		// TODO Auto-generated method stub
		List<String> syncArrayList = Collections.synchronizedList(new ArrayList<String>());

		//Adding elements to synchronized ArrayList
		syncArrayList.add("Pen");
		syncArrayList.add("NoteBook");
		syncArrayList.add("Ink");

		System.out.println("Iterating synchronized ArrayList:");
		synchronized(syncArrayList) {
			Iterator<String> iterator = syncArrayList.iterator(); 
			while (iterator.hasNext())
				System.out.println(iterator.next());
		}

	}


	/**
	 * ArrayList of String type and we are cloning it to another ArrayList using clone() method. 
	 * The interesting point to see here is when we added and removed few elements from original ArrayList after the clone() method, 
	 * the cloned ArrayList didn’t get affected. It shows that clone() method just returns a shallow copy of ArrayList.
	 */
	@SuppressWarnings("unchecked")
	private static void ArrayListCloneMethod() {
		// TODO Auto-generated method stub
		//Adding elements to the ArrayList
		ArrayList<String> al = new ArrayList<String>();
		al.add("Apple");
		al.add("Orange");
		al.add("Mango");
		al.add("Grapes");
		System.out.println("ArrayList: "+al);

		//		ArrayList<String> al2 = new ArrayList<String>();
		//		al2=(ArrayList<String>) (al.clone());					or as below

		ArrayList<String> al2 = (ArrayList<String>)al.clone();
		System.out.println("Shallow copy of ArrayList: "+ al2);

		//add and remove on original ArrayList
		al.add("Fig");
		al.remove("Orange");

		//Display of both ArrayLists after add & remove
		System.out.println("Original ArrayList:"+al);
		System.out.println("Cloned ArrayList:"+al2);


	}

	/**
	 * ArrayList contains() method is used for checking the specified element existence in the given list.
	public boolean contains(Object element)
	It returns true if the specified element is found in the list else it gives false.

	 */
	private static void ArrayListContainsMethod() {

		ArrayList<String> al = new ArrayList<String>();
		al.add("pen");
		al.add("pencil");
		al.add("ink");
		al.add("notebook");

		System.out.println("ArrayList contains the string 'ink pen': "+al.contains("ink pen"));
		System.out.println("ArrayList contains the string 'pen': "+al.contains("pen"));
		System.out.println("ArrayList contains the string 'pencil': "+al.contains("pencil"));
		System.out.println("ArrayList contains the string 'book': "+al.contains("book"));

		ArrayList<Integer> al2 = new ArrayList<Integer>();
		al2.add(1);
		al2.add(99);
		al2.add(56);
		al2.add(13);
		al2.add(44);
		al2.add(6);

		System.out.println("'1' is present in arraylist: "+al2.contains(1));
		System.out.println("'55' is present in arraylist: "+al2.contains(55));
		System.out.println("'44' is there in arraylist: "+al2.contains(44));
		System.out.println("'7' is there in arraylist: "+al2.contains(7));


	}

	/**
	 * To access elements
	 */
	private static void ArrayListGetMethod() {
		ArrayList<String> al = new ArrayList<String>();
		al.add("pen");
		al.add("pencil");
		al.add("ink");
		al.add("notebook");
		al.add("book");
		al.add("books");
		al.add("paper");
		al.add("white board");

		System.out.println("First element of the ArrayList: "+al.get(0));
		System.out.println("Third element of the ArrayList: "+al.get(2));
		System.out.println("Sixth element of the ArrayList: "+al.get(5));
		System.out.println("Fourth element of the ArrayList: "+al.get(3));


	}

	/**
	 * To make sublist from a list with index including start and excluding ending
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
	 * Size of arraylist
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
	 * To do sorting of arrayList
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
	 * How to do add all elements in arrayList
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
	 * How to add in ArrayList	which is integer
	 */
	private static void ArrayListIntegerAddRemove() {
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

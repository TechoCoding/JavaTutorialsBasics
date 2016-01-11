package com.hastimal.javacollection;

public class DifferenceBetweenCollections {
	public static void main(String[] args) {
		ArrayListVsVector();
	}

	/**
	 * /**
	 * ArrayList and Vector both use Array as a data structure internally. 
	 * 1) Synchronization: ArrayList is non-synchronized which means multiple threads can work on ArrayList 
	 * at the same time. For e.g. if one thread is performing an add operation on ArrayList, 
	 * there can be an another thread performing remove operation on ArrayList at the same time in a 
	 * multithreaded environment
	 * while Vector is synchronized. This means if one thread is working on Vector, 
	 * no other thread can get a hold of it. Unlike ArrayList, only one thread can perform an operation on vector at a time.
	 * 2) Resize: Both ArrayList and Vector can grow and shrink dynamically to maintain the optimal use of storage, 
	 * however the way they resized is different. ArrayList grow by half of its size when resized while Vector doubles
	 * the size of itself by default when grows.
	 * 3) Performance: ArrayList gives better performance as it is non-synchronized. 
	 * Vector operations gives poor performance as they are thread-safe, the thread which works on Vector gets a 
	 * lock on it which makes other thread wait till the lock is released.
	 * 4) fail-fast: First let me explain what is fail-fast: If the collection (ArrayList, vector etc) gets structurally 
	 * modified by any means, except the add or remove methods of iterator, after creation of iterator then the iterator 
	 * will throw ConcurrentModificationException. Structural modification refers to the addition or deletion of elements 
	 * from the collection. As per the Vector javadoc the Enumeration returned by Vector is not fail-fast. 
	 * On the other side the iterator and listIterator returned by ArrayList are fail-fast.*/
	private static void ArrayListVsVector() {
		// TODO Auto-generated method stub

	}

}

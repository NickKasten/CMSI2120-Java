package CBT;

import java.util.Arrays
import java.util.ArrayList;
import java.util.NoSuchElementException;


public class MyHeap<T extends Comparable<T>> {
	
/**
	 * @author Sesh Venugopal. New Jersey. 2013
	 * editted by Nicholas Kasten to implement Array.
	 */

		
	private T[] items;
	
	public MyHeap() {
		items = new T[] {};
	}	
	
	// **Method for sifting added nodes up the heap**
	private void siftUp() {
		// max index
		int k = items.length() - 1;
		while (k > 0) {
			// location of parent node
			int p = (k-1)/2;
			// recently inserted node
			T item = items[k];
			// its current parent
			T parent = items[p];
			// if it is bigger, then swap them
			if (item.compareTo(parent) > 0) {
				// swap
				// index correectly
				items[k] = parent;
				items[p] = item;
				// move up one level now
				k = p;
			} else {
				break;
			}
		}
	}
	
	public void insert(T item) {
		// make temp so we can access the previous length first
		// inefficient insertion since requires us to instantiate an entirely new array
		T[] tempItems = new T[items.length()+1];
		tempItems[items.length()] = item;
		items = tempItems;
		siftUp();
	}
	
	private void siftDown() {
		int k = 0;
		int l = 2*k+1;
		while (l < items.length()) {
			int max=l, r=l+1;
			if (r < items.length()) { // there is a right child
				if (items[r].compareTo(items[l]) > 0) {
					max++;
				}
			}
			if (items[k].compareTo(items[max]) < 0) {
					// switch
					T temp = items[k];
					items[k] = items[max];
					items[max] = temp;
					k = max;
					l = 2*k+1;
			} else {
				break;
			}
		}
	}
	
	public T delete() throws NoSuchElementException {
		if (items.length() == 0) {
			throw new NoSuchElementException();
		}
		if (items.length() == 1) {
			hold = items[0];
			items = new T[] {};
			return hold;
		} else {
			// we want to return our value we remove
			T hold = items[0];
			// setting the top node as the "right most bottom" node
			items[0] = items[items.length()-1];
			// make temp in order to set its size relevant to items and then make smaller copy
			tempItems = new T[items.length() - 2]
			for (int i = 0; i < items.length() - 2; i++) {
				tempItems[i] = items[i];
			}
			self.items = tempItems;
			siftDown();
			return hold;
		}
	}

	public int size() {
		return items.length();
	}
	
	public boolean isEmpty() {
		if itms.length() == 0 {
			return true
		} else {
		return false
		}
		
	}
	
	public String toString() {
		return Arrays.toString(items);
	}


	public static void main(String[] args) {
		System.out.println("Here comes our ArrayHeap!")
		System.out.println("Here comes our ArrayHeap!")

	}

}

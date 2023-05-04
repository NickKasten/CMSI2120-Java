
import java.util.Arrays;
import java.util.ArrayList;
import java.util.NoSuchElementException;


public class MyHeap {
	
/**
	 * @author Sesh Venugopal. New Jersey. 2013
	 * editted by Nicholas Kasten to implement Array.
	 */

		
	private int[] items;
	
	public MyHeap() {
		items = new int[0];
	}	
	
	// **Method for sifting added nodes up the heap**
	private void siftUp() {
		// debug: System.out.println(Arrays.toString(items));
		// max index
		int k = items.length - 1;
		while (k > 0) {
			// location of parent node
			int p = (k-1)/2;
			// recently inserted node
			int item = items[k];
			// its current parent
			int parent = items[p];
			// if it is bigger, then swap them
			if (item > parent) {
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
	
	public void insert(int item) {
		// make temp so we can access the previous length first
		// inefficient insertion since requires us to instantiate an entirely new array
		int[] tempItems = new int[items.length+1];
		for (int i = 0; i <= items.length - 1; i++) {
			tempItems[i] = items[i];
		}
		tempItems[items.length] = item;
		items = tempItems;
		siftUp();
	}
	
	private void siftDown() {
		int k = 0;
		int l = 2*k+1;
		while (l < items.length) {
			int max=l, r=l+1;
			if (r < items.length) { // there is a right child
				if (items[r] > items[l]) {
					max++;
				}
			}
			if (items[k]< items[max]) {
					// switch
					int temp = items[k];
					items[k] = items[max];
					items[max] = temp;
					k = max;
					l = 2*k+1;
			} else {
				break;
			}
		}
	}
	
	public int delete() throws NoSuchElementException {
		if (items.length == 0) {
			throw new NoSuchElementException();
		}
		if (items.length == 1) {
			int hold = items[0];
			items = new int[0];
			return hold;
		} else {
			// we want to return our value we remove
			int hold = items[0];
			// setting the top node as the "right most bottom" node
			items[0] = items[items.length-1];
			// make temp in order to set its size relevant to items and then make smaller copy
			int[] tempItems = new int[items.length - 2];
			for (int i = 0; i < items.length - 2; i++) {
				tempItems[i] = items[i];
			}
			items = tempItems;
			siftDown();
			return hold;
		}
	}

	public int size() {
		return items.length;
	}
	
	public boolean isEmpty() {
		if (items.length == 0) {
			return true;
		} else {
		return false;
		}
		
	}
	
	public String toString() {
		return Arrays.toString(items);
	}


	public static void main(String[] args) {
		System.out.println("Here comes our ArrayHeap!");
		MyHeap ourHeap = new MyHeap();
		System.out.println("Is it empty?");
		System.out.println(ourHeap.isEmpty());
		System.out.println("Now let's add in 10, 5, and 16");
		ourHeap.insert(10);
		ourHeap.insert(5);
		ourHeap.insert(16);
		System.out.println("How does our Heap look?");
		System.out.println(ourHeap.toString());
		System.out.println("What's our size?");
		System.out.println(ourHeap.size());
		System.out.println("Wow, that looks great!");
		System.out.println("Now lets add 20, 15, 2, and our favorite, 1");
		ourHeap.insert(20);
		ourHeap.insert(15);
		ourHeap.insert(2);
		ourHeap.insert(1);
		System.out.println(ourHeap.toString());
		System.out.println("That's more like it!");
		System.out.println("But I think it's time to delete, hopefully 20 isn't too sad :(");
		ourHeap.delete();
		System.out.println("Bye 20!");
		System.out.println(ourHeap.toString());
	}

}

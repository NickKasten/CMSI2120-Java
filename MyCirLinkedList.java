//package example1;
import java.util.Scanner;

public class MyCirLinkedList {
	CNode start;
	CNode end;
	public int size;
	public MyCirLinkedList() {
		start = null;
		end = null;
		size = 0;
	}
	
	public boolean isEmpty() {
		return start==null;
	}
	
	public int getSize() {
		return size;
	}
	
	public void add(int n) {
		CNode trav = new CNode(n, null);
		trav.setLink(start);
		if (this.isEmpty()) {
			// first element
			start = trav;
			trav.setLink(start);
			end = start;
			this.size = 0;
		} else {
			end.setLink(trav);
			start = trav;}
		this.size++;}
	
	public void printList( ) {
		if (this.isEmpty()) {
			System.out.println("nothing");
		} else {
			CNode trav;
			trav = start;
			int counter = 0;
			while(counter < this.size) {
				System.out.println(trav.getData());
				trav = trav.getLink();
				counter ++;
			}
		}
	}

	public void insertBefore (int index, CNode n) {
		if ((index > size) || (index <= 0)) {
			System.out.println("Index out of range");
		} else if (index == 1) {
			n.setLink(start);
			end = start;
			start = n;
			this.size ++;
		} else {
			int count = 0;
			CNode trav;
			trav = start;
			while(count!=index-1) {
				trav = trav.getLink();
				count++;
			}
			n.setLink(trav.getLink());
			trav.setLink(n);
			this.size++;
		}
	}

	public void insertAfter (int index, CNode n) {
		if ((index > size) || (index < 0)) {
			System.out.println("Index out of range");
		} else if (index == 0) {
			n.setLink(start.getLink());
			start.setLink(n);
			end = n;
			this.size ++;
		} else {
			int count = 0;
			CNode trav;
			trav = start;
			while(count!=index) {
				trav = trav.getLink();
				count++;
			}
			n.setLink(trav.getLink());
			trav.setLink(n);
			this.size++;
		}
	}

	public int indexOf(int num) {
		CNode trav;
		trav = start;
		int counter = 0;
		while(trav.getData() != num) {
			trav = trav.getLink();
			counter ++;
		}
		return counter;
	}

	public void removeNodeAt(int index) {
		if ((index > size) || (index < 0)) {
			System.out.println("Index out of range");
		} else {
			CNode trav;
			trav = start;
			int counter = 0;
			while(counter < (index - 1)) {
				trav = trav.getLink();
				counter ++;
			}
			CNode q;
			q = trav.getLink().getLink(); //the one after the user's index
			trav.setLink(q);
			
			this.size --;
		}
	}
}

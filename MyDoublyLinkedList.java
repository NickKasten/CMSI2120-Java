class MyDoublyLinkedList {

    private Node head;
    private Node tail;
    private int len;

    MyDoublyLinkedList() {
        //the head is null since the list contains nothing yet
        head = null;
        tail = null;
    }

    public void addNode(String s) {
        Node n = new Node(s);
        // now when adding we set the node we've made to the head (and tail)
        if (head == null) {
            head = n;
            tail = n;
            this.len = 0;
        } else {
            Node trav;
            trav = head;
            while (trav.next!=null) {
                trav = trav.next;
             }
             trav.next = n;
             n.previous = trav;
             tail = n;
             this.len++;
           }
        }


    public void printList() { 
        if (len == 0) {
            System.out.println("nothing in list!");
        } else {
            Node trav;
            trav = head;
            int counter = 0;
            while (counter <= this.len) {
                // debug: System.out.printf("We are trying to print node %d", counter);
                System.out.println(trav.name);
                trav = trav.next;
                counter ++;
            }
        }
    }

    public void insertBefore (int index, String s) {
        Node n = new Node(s);
        if ((index == 0) || index>len) {
            System.out.println("Insertion Error: Index out of bounds");
        } else if (index==0) {
            // debug: System.out.println("I'm the _____ thats not working >.<");
            head.previous = n;
            n.next = head;
            head = n;
            this.len ++;
        } else if (index <= (len/2)){
            // debug: System.out.println("I made it to the regular before add!!!");
            Node trav;
            trav = head;
            int counter = 0;
            while (counter!=(index-1)) {
                //indexing over to the one right before
                //because I have to set the nodes' next and previous pointers
                trav = trav.next;
                counter ++;
            }
            //trav.next's (the indexed node) previous is now the user's
            trav.next.previous = n;
            //user's previous is the index-1 (trav)
            n.previous = trav;
            //user's next is trav.next (the indexed node) before we reassign trav.next to the user's
            n.next = trav.next;
            //index-1's next is now the user's
            trav.next = n;
            //increase length
            this.len ++;

        // go backwards for more efficiency
        } else {
            // debug: System.out.println("I made it to the backwards before add!!!");
            Node trav;
            trav = tail;
            int counter = 0;
            while (counter!=((this.len - (index)))) {
                trav = trav.previous;
                counter ++;
            }
            trav.previous.next = n;

            n.next = trav;

            n.previous = trav.previous;

            trav.previous = n;
            this.len ++;
        }
    }

    public void insertAfter (int index, String s) {
        Node n = new Node(s);
        if (index>len) {
            System.out.println("Insertion Error: Index out of bounds");
        // } else if (index==1) {
        //     head.previous = n;
        //     n.next = head;
        //     this.len ++;
        } else if (index <= (len/2)){
            Node trav;
            trav = head;
            int counter = 0;
            while (counter!=(index)) {
                trav = trav.next;
                counter ++;
            }
            //trav.next's (the indexed node) previous is now the user's
            trav.next.previous = n;
            //user's previous is the index-1 (trav)
            n.previous = trav;
            //user's next is trav.next (the indexed node) before we reassign trav.next to the user's
            n.next = trav.next;
            //index-1's next is now the user's
            trav.next = n;
            //increase length
            this.len ++;

        // go backwards for more efficiency
        } else {
            Node trav;
            trav = tail;
            int counter = 0;
            while (counter!=((this.len - index)-1)) {
                trav = trav.previous;
                counter ++;
            }
            trav.previous.next = n;

            n.next = trav;

            n.previous = trav.previous;

            trav.previous = n;
            this.len ++;
        }
    }
    // adds Node n after index value      
    public int indexOf(String str) {
        
        boolean found = false;
        Node trav = head;
        int counter = 0;

        while (!found) {
            if (trav.name.equals(str)) {
                // debug: System.out.println("we made it here");
                found = true;
                return counter;
            } else if (counter > len) {
                return -1;
            } else {
                // debug: System.out.println("we are still going");
                counter ++;
                trav = trav.next;
            }
        }
        return counter;
    }
    //returns index of where String str  is at.  Returns -1 if String str is not in LinkedList
    public void removeNodeAt(int index) {
        // removes Node at index value
		if((index > len) || (index < 0)){
		   System.out.println("Insertion index out of bound");  
        } else if (index == 0) {
            // debug: System.out.println("we made it here");
            // debug: System.out.println(head.next.previous.name);
            head.next.previous = null;
            // debug: System.out.println(head.next.name);
            head = head.next;
            // debug: System.out.println(head.name);
            len --;
	    } else if (index <= len/2) {
		   Node trav;
		   trav = head;
		   int counter = 0;
		   while (counter < index-1)
		   {
			   trav = trav.next;
			   counter++;
		   }
		   Node r;
		   r = trav.next.next;
		   trav.next = r;
           r.previous = trav;
			 
		   this.len--; 
	    } else {
            Node trav;
            trav = tail;
            int counter = 0;
            while (counter < this.len - (index))
            {
                trav = trav.previous;
                counter++;
            }
            Node r;
            r = trav.previous.previous;
            trav.previous = r;
            r.next = trav;
            
            this.len--; 
       }

    }
    // removes Node at index value

}

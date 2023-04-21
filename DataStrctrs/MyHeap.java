import java.util.ArrayList;
import java.util.NoSuchElementException;

public class MyHeap<T extends Comparable<T>> {
    // the node type T extends Comparable (which I guess is a property of Integers and float)


    private ArrayList<T> items;
    
    public MyHeap() {
        items = new ArrayList<T>();
    }

    private void siftUp() {
        // this is the farthest leaf node!!!
        int k = items.size() - 1;
        // THIS IS US DEALING WITH THE ARRAYLIST IMPLEMENTATION FOR THE TREE
        while (k > 0) {
            // this is calculating the parent index!!
            int p = (k-1)/2;
            // assigning them
            T item = items.get(k);
            T parent = items.get(p);
            // if the child (item) is < the parent:
            if (item.compareTo(parent) > 0) {
                // swap them and 
                items.set(k, parent);
                items.set(p, item);

                // move up one level
                k = p;
            } else {
                break;
            }
        }
    }



}

public class SingleLinkedQueue implements Queue{
    // We cannot use a record because we have to mutate these nodes
    private static class Node {
        Object data;
        Node next;

        Node(Object data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    SingleLinkedQueue() {
        head = null;
        tail = null;
        size = 0;
    }

    public void enqueue(Object item) {
        if (isEmpty()) {
            head = new Node(item, null);
            tail = head;
        } else {
            tail.next = new Node(item, tail.next);
            tail = tail.next;
        }
        size++;
    }

    public Object dequeue() {
        var rmv = peek();
        if (head == tail) {
            // Last node deleted
            tail = head = null;
        } else {
            // Just "point around" the old head you are deleting
            head = head.next;
        }
        size--;
        return rmv;
    }

    public Object peek() {
        if (isEmpty()) {
            return null;
        }
        return head.data;
    }

    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }
}
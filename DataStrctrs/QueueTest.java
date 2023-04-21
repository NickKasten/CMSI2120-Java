public class QueueTest {
    public static void main(String[] args) {
        SingleLinkedQueue slq = new SingleLinkedQueue();
        System.out.println("We now have a Queue! Is it empty?");
        System.out.println(slq.isEmpty());
        System.out.println("Our Queue is empty, so Bob is joining.");
        slq.enqueue("Bob");
        System.out.println("This is what we found! :");
        System.out.println(slq.peek());
        System.out.println("Stacy and Joe want to join too!");
        slq.enqueue("Stacy");
        slq.enqueue("Joe");
        System.out.println("The length of the queue is now:");
        System.out.println(slq.size());
        System.out.println("Bob and Stacy have to run, now, leaving only Joe :(");
        slq.dequeue();
        slq.dequeue();
        System.out.println("The only one left is:");
        System.out.println(slq.peek());
    }
}

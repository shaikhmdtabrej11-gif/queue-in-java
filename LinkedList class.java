
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();

        // Insert elements
        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.offer(40);

        System.out.println("Queue: " + q);

        // View first element
        System.out.println("Front: " + q.peek());

        // Remove first element
        System.out.println("Removed: " + q.poll());

        // Display updated queue
        System.out.println("Updated Queue: " + q);

        // Check size
        System.out.println("Size: " + q.size());

        // Check if empty
        System.out.println("Is Empty: " + q.isEmpty());
    }
}

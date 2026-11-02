import java.util.*;

public class QueueExample {
    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);

        System.out.println("Queue: " + queue);

        System.out.println("Front: " + queue.peek());

        System.out.println("Removed: " + queue.poll());

        System.out.println("After Removal: " + queue);

        System.out.println("Queue Size: " + queue.size());
    }
}

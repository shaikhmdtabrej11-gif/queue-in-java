import java.util.LinkedList;
import java.util.Queue;

public class QueueOperations {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.offer("Java");
        queue.offer("DSA");
        queue.offer("Spring Boot");

        System.out.println("Size: " + queue.size());
        System.out.println("Is Empty: " + queue.isEmpty());
        System.out.println("Front: " + queue.peek());

        queue.poll();

        System.out.println("After Removal: " + queue);
    }
}

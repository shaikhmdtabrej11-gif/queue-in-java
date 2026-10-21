import java.util.LinkedList;
import java.util.Queue;

public class QueueTraversal {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(5);
        queue.offer(10);
        queue.offer(15);
        queue.offer(20);

        System.out.println("Queue Elements:");

        for (int element : queue) {
            System.out.println(element);
        }
    }
}

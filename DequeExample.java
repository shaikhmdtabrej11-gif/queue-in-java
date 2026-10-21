
import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {
    public static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<>();

        dq.offerFirst(20);
        dq.offerFirst(10);
        dq.offerLast(30);
        dq.offerLast(40);

        System.out.println(dq);
        System.out.println("First: " + dq.peekFirst());
        System.out.println("Last: " + dq.peekLast());

        dq.pollFirst();
        dq.pollLast();

        System.out.println("After removal: " + dq);
    }
}

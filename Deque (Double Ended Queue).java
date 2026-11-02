import java.util.*;

public class DequeExample {

    public static void main(String[] args) {

        Deque<Integer> dq = new ArrayDeque<>();

        dq.addFirst(10);
        dq.addLast(20);
        dq.addFirst(5);
        dq.addLast(30);

        System.out.println("Deque: " + dq);

        dq.removeFirst();
        dq.removeLast();

        System.out.println("After Removal: " + dq);

        System.out.println("First: " + dq.peekFirst());
        System.out.println("Last: " + dq.peekLast());
    }
}

import java.util.*;

public class BinaryNumbers {

    public static void main(String[] args) {

        Queue<String> q = new LinkedList<>();

        q.offer("1");

        int n = 10;

        for (int i = 1; i <= n; i++) {

            String current = q.poll();

            System.out.println(current);

            q.offer(current + "0");
            q.offer(current + "1");
        }
    }
}

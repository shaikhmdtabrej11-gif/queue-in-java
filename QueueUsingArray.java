
public class QueueUsingArray {
    private int[] arr = new int[5];
    private int front = 0, rear = -1, size = 0;

    public void enqueue(int value) {
        if (size == arr.length) {
            System.out.println("Queue is full");
            return;
        }
        rear = (rear + 1) % arr.length;
        arr[rear] = value;
        size++;
    }

    public void dequeue() {
        if (size == 0) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Removed: " + arr[front]);
        front = (front + 1) % arr.length;
        size--;
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[(front + i) % arr.length] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QueueUsingArray q = new QueueUsingArray();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();
        q.dequeue();
        q.display();
    }
}

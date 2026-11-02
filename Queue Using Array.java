class CustomQueue {

    private int[] arr;
    private int front, rear, size, capacity;

    CustomQueue(int capacity) {

        this.capacity = capacity;
        arr = new int[capacity];

        front = 0;
        rear = -1;
        size = 0;
    }

    void enqueue(int value) {

        if (size == capacity) {
            System.out.println("Queue Overflow");
            return;
        }

        rear = (rear + 1) % capacity;
        arr[rear] = value;
        size++;

        System.out.println(value + " Inserted");
    }

    void dequeue() {

        if (size == 0) {
            System.out.println("Queue Underflow");
            return;
        }

        System.out.println("Removed: " + arr[front]);

        front = (front + 1) % capacity;
        size--;
    }

    void display() {

        if (size == 0) {
            System.out.println("Queue is Empty");
            return;
        }

        for (int i = 0; i < size; i++) {
            System.out.print(arr[(front + i) % capacity] + " ");
        }

        System.out.println();
    }
}

public class Main {

    public static void main(String[] args) {

        CustomQueue q = new CustomQueue(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.display();

        q.dequeue();

        q.display();
    }
}

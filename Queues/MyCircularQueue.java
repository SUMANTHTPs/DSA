package Queues;

class CircularQueue {
    int front, rear, count, size;
    int[] q;

    CircularQueue(int queSize) {
        front = -1;
        rear = -1;
        size = queSize;
        q = new int[queSize];
        count = 0;
    }

    public boolean isEmpty() {
        return (front == -1 && rear == -1);
    }

    public boolean isFull() {
        return (count == size - 1);
    }

    public void enque(int x) {
        if (isEmpty()) {
            front = 0;
            rear = 0;
            q[rear] = x;
        } else if ((rear + 1) % size != front) {
            rear = (rear + 1) % size;
            q[rear] = x;
        } else {
            throw new RuntimeException("Overflow");
        }
        count++;
    }

    public int deque() {
        if (!isEmpty()) {
            int data = q[front];
            if (front == rear) {
                front = rear = -1;
            } else {
                front = (front + 1) % size;
            }
            count--;
            return data;
        } else {
            throw new RuntimeException("Underflow");
        }
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }

        int current = front;
        int elementsPrinted = 0;
        while (elementsPrinted < count) {
            System.out.print(q[current] + " ");
            current = (current + 1) % size;
            elementsPrinted++;
        }
        System.out.println();
    }
}

public class MyCircularQueue {
    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue(5);
        cq.enque(1);
        cq.enque(2);
        cq.enque(3);
        cq.enque(4);
        cq.enque(5);
        System.out.println(cq.deque());
        System.out.println(cq.deque());
        cq.enque(6);
        cq.enque(7);
        cq.printQueue();
    }
}

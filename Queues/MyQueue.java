package Queues;

class NewQue {
    int front, rear, count, size;
    int[] queues;

    NewQue(int queueSize) {
        size = queueSize;
        queues = new int[size];
        front = -1;
        rear = -1;
        count = 0;
    }

    public boolean isEmpty() {
        return front == rear;
    }

    public boolean isFull() {
        return (count == size);
    }

    public void enque(int x) {
        if (isFull()) {
            throw new RuntimeException("Queue overflow");
        }
        if (isEmpty()) {
            front = 0;
        }
        queues[++rear] = x;
        count++;
    }

    public int deque() {
        if (isEmpty()) {
            throw new RuntimeException("Queue underflow");
        }
        int data = queues[front];
        if (++front > rear) {
            front = -1;
            rear = -1;
        }
        count--;
        return data;
    }

    public void printQueue() {
        for (int i = front; i <= rear; i++) {
            System.out.print(queues[i] + " ");
        }
        System.out.println();
    }
}

public class MyQueue {
    public static void main(String[] args) {
        NewQue q = new NewQue(5);
        q.enque(1);
        q.enque(2);
        q.enque(3);
        q.enque(4);
        q.enque(5);
        System.out.println(q.deque());
        System.out.println(q.deque());


        q.printQueue();
    }
}

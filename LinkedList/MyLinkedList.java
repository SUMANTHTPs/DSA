package LinkedList;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class MyLinkedList {
    Node head;
    // Node tail;
    int size;

    MyLinkedList() {
        head = null;
        // tail = null;
        size = 0;
    }

    public void insertFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    public void insertLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public int getSize() {
        return size;
    }

    public int getKthElementFromLast(int k) {
        Node slow = head;
        Node fast = head;
        int count = 0;
        while (count < k) {
            fast = fast.next;
            count++;
        }
        System.out.println(count);
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow.data;
    }

    public void reverse() {
        Node previous = null, current = head;
        while (current != null) {
            Node next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        head = previous;
    }

    public static void main(String[] args) {
        MyLinkedList l = new MyLinkedList();
        l.insertFirst(0);
        l.insertFirst(1);
        l.insertFirst(2);
        l.insertFirst(3);
        l.insertLast(4);
        l.display();
        // System.out.println(l.size);
        System.out.println(l.getKthElementFromLast(4));
        l.reverse();
        l.display();
    }
}

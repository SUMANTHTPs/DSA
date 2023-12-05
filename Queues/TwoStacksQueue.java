package Queues;

import java.util.Stack;

class StacksQue {
    Stack<Integer> pushStack;
    Stack<Integer> popStack;

    StacksQue() {
        pushStack = new Stack<>();
        popStack = new Stack<>();
    }

    public void enque(int x) {
        pushStack.push(x);
    }

    /**
     * Check pop: isEMpty and push: not empty 
     * and copy the elements from push to pop
     * @return
     */
    public int deque() {
        if (popStack.isEmpty() && !pushStack.isEmpty()) {
            while (!pushStack.isEmpty()) {
                popStack.push(pushStack.pop());
            }
        } else if (!popStack.isEmpty()) {
            return popStack.pop();
        } else {
            System.out.println("Queue is empty");
            throw new RuntimeException("Queue is empty, Cannot find elements in push stack");
        }
        return popStack.pop();
    }

    public boolean isEmpty() {
        return popStack.isEmpty() && pushStack.isEmpty();
    }
}

public class TwoStacksQueue {
    public static void main(String[] args) {
        StacksQue sq = new StacksQue();
        sq.enque(0);
        sq.enque(1);
        sq.enque(1);
        sq.enque(2);
        sq.enque(22);
        sq.enque(3);
        System.out.println(sq.isEmpty());
        System.out.println(sq.deque());
        System.out.println(sq.deque());
        System.out.println(sq.deque());
        System.out.println(sq.deque());
        System.out.println(sq.deque());
        System.out.println(sq.deque());
        System.out.println(sq.isEmpty());
    }
}

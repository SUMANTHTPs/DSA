package Stacks;

import java.util.Stack;

class MinStackImp{
	Stack<Integer> main;
	Stack<Integer> min;
	
	public MinStackImp(){
		main = new Stack<>();
		min = new Stack<>();
	}
	
	public void push(int x) {
		main.push(x);
		if(min.isEmpty() || min.peek() >= x) {
			min.push(x);
		}
	}
	
	public int pop() {
		int mainPoped = main.pop();
		if(mainPoped == min.peek())
			min.pop();
		return mainPoped;
	}
	
	public int top() {
		if(!main.isEmpty()) {
			return main.size()-1;
		}
		throw new RuntimeException("Stack is empty");
	}

    public int peek() {
        if(!main.isEmpty()) {
			return main.peek();
		}
        throw new RuntimeException("Stack is empty");
    }
	public int getMin() {
		if(!min.isEmpty()) {
			return min.peek();
		}
		throw new RuntimeException("Min stack is empty");
	}
}
public class MinStack {

	public static void main(String[] args) {
		MinStackImp min = new MinStackImp();
		min.push(6);
		min.push(3);
		min.push(4);
		min.pop();
		min.pop();
		min.push(2);
		min.push(23);
		min.push(23);
		System.out.println(min.getMin());
		System.out.println(min.peek());

	}

}


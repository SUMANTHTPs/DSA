package Stacks;
import java.util.ArrayList;

class MyStack {
    private ArrayList<Integer> stackList;
    int top;

    public MyStack() {
        stackList = new ArrayList<>();
        top=-1;
    }
    
    public void push(int x) {
    	stackList.add(++top, x);
    }
    
    public int pop() {
    	if(!isEmpty()) {
    		return stackList.remove(top--);
    	}
    	throw new RuntimeException("Stack is empty, can't pop");
    }
    
    public int top() {
    	if(!isEmpty())
    		return top;
    	throw new RuntimeException("Stack is empty, can't get the top");
    }
    
    public int peek() {
    	return stackList.get(top);
    }
    
    public boolean isEmpty() {
    	if(top == -1)
    		return true;
    	return false;
    }
}
public class NewStacks {

	public static void main(String[] args) {
		MyStack s = new MyStack();
		s.push(5);
		s.push(15);
		System.out.println(s.top());
		System.out.println(s.peek());
		System.out.println(s.isEmpty());
		s.pop();
		System.out.println(s.pop());
		System.out.print(s.isEmpty());
//		s.pop();

	}

}

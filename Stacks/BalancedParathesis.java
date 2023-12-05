package Stacks;

import java.util.Stack;

public class BalancedParathesis {

	public static boolean checkBalance(String s) {
		Stack<Character> st = new Stack<>();
		for (Character c : s.toCharArray()) {
			if (c == '(' || c == '{' || c == '[') {
				st.push(c);
			} else if (c == ')' || c == '}' || c == ']') {
				if (st.isEmpty() || !matchParathesis(st.peek(), c)) {
					return false;
				}
				st.pop();
			}
		}
		return st.isEmpty(); // Edge case
	}

	public static boolean matchParathesis(char opening, char closing) {
		return (opening == '(' && closing == ')') || (opening == '{' && closing == '}')
				|| (opening == '[' && closing == ']');
	}

	public static void main(String[] args) {

		String str = "([)]";
		System.out.print(checkBalance(str));

	}

}

package Stacks;

import java.util.Stack;

public class NearestSmallerElement {

    public static int[] getNearestSmallerElements(int[] a) {
        int n = a.length;
        int[] res = new int[n];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && stack.peek() >= a[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                res[i] = -1;
            } else {
                res[i] = stack.peek();
            }
            stack.push(a[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 5, 2, 10, 8, 2, 9, 10 };
        for (int ele : getNearestSmallerElements(arr)) {
            System.out.print(ele + " ");
        }
    }
}

// PG: 190
/**
 * Returns -1 if no small element found
 * i: 4 5 2 10 8 2 9 10
 * o: -1 4 -1 2 2 -1 2 9
 */

package Stacks;

import java.util.Stack;

public class RightNearestSmallestElement {
    public static int[] getRightNearestSmallerElements(int[] a) {
        Stack<Integer> st = new Stack<>();
        int len = a.length;
        int[] res = new int[len];
        for (int i = len - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() >= a[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                res[i] = -1;
            } else {
                res[i] = st.peek();
            }
            st.push(a[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] a = { 4, 5, 2, 10, 8, 2, 9, 10 };
        for (int e : getRightNearestSmallerElements(a)) {
            System.out.print(e + " ");
        }
    }
}

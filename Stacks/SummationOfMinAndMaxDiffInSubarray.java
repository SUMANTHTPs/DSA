/**
 * PG: 192
 * Find the summation of all the possible subarray's min and max difference.
 * i.e: {2,5,3}
 * {2},{5},{3},{2,5},{5,3},{2,5,3}
 * o: 0+0+0+3+2+3=8
 */

package Stacks;

import java.util.Stack;

public class SummationOfMinAndMaxDiffInSubarray {
    public int naive(int[] a) {
        int n = a.length, min = 0, max = 0, ans = 0;
        for (int i = 0; i < n; i++) {
            min = max = a[i];
            for (int j = i + 1; j < n; j++) {
                min = Math.min(min, a[j]);
                max = Math.max(max, a[j]);
                ans += max - min; // If this is outside 1st loop, Your assumption is wrong since it has to
                                  // calculate all the diff. for change in min and max
            }
        }
        return ans;
    }

    public static int optimized(int[] a) {
        int n = a.length;
        Stack<Integer> stack = new Stack<>();
        int[] left = new int[n];
        int[] right = new int[n];

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && a[stack.peek()] >= a[i]) {
                stack.pop();
            }
            left[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }
        stack.clear();

        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && a[stack.peek()] >= a[i]) {
                stack.pop();
            }
            right[i] = stack.isEmpty() ? n : stack.peek();
            stack.push(i);
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans += (a[i] * (i - left[i]) * (right[i] - i));
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] a = { 2, 5, 3 };
        SummationOfMinAndMaxDiffInSubarray l = new SummationOfMinAndMaxDiffInSubarray();
        System.out.println(l.naive(a));

        // Not working
        //System.out.println(optimized(a));
    }
}

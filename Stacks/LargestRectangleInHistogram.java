package Stacks;

import java.util.Stack;

public class LargestRectangleInHistogram {
    public static int largestRectangleAreaGPTCode(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;

        for (int i = 0; i <= heights.length; i++) {
            int h = (i == heights.length) ? 0 : heights[i];

            // h is array element checked with stack peek element
            while (!stack.isEmpty() && h < heights[stack.peek()]) {
                int height = heights[stack.pop()];
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
                maxArea = Math.max(maxArea, height * width);
                System.out.println(
                        "h= " + h + " height= " + height + " w= " + width + " area= " + (width * height) + " ind: " + i
                                + " max area: " + maxArea);
            }

            stack.push(i);
            // System.out.println("Pushing: " + i);
        }

        return maxArea;
    }

    public static int getlargestRectangleArea(int[] a) {
        int len = a.length;
        int[] smallLeft = new int[len];
        int[] smallRight = new int[len];
        Stack<Integer> s = new Stack<>();

        int maxArea = 0;
        for (int i = 0; i < len; i++) {
            while (!s.isEmpty() && a[s.peek()] >= a[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                smallLeft[i] = -1;
            } else {
                smallLeft[i] = s.peek();

            }
            s.push(i);
        }
        s.clear();
        for (int i = len - 1; i >= 0; i--) {
            while (!s.isEmpty() && a[s.peek()] >= a[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                smallRight[i] = len;
            } else {
                smallRight[i] = s.peek();

            }
            s.push(i);
        }
        for (int i = 0; i < len; i++) {
            int h = a[i];
            int w = smallRight[i] - smallLeft[i] - 1;
            maxArea = Math.max(maxArea, h * w);
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int[] histogram = { 2, 1, 5, 6, 3, 4 };
        int largestRectangle = largestRectangleAreaGPTCode(histogram);
        System.out.println("Largest Rectangle Area: " + largestRectangle);
        System.out.println("Largest Rectangle Area: " + getlargestRectangleArea(histogram));
    }
}
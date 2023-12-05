// It is sliding window maximum problem
////////////////////////////////////////////////////////////////
// For edge cases, this is not the solution.

package Queues;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class PS2Q8 {

	public static void main(String[] args) {

		int[] a = { 7, 6, 3, 4, 2, 8 };
		Deque<Integer> dq = new ArrayDeque<>();
		ArrayList<Integer> out = new ArrayList<>();
		int k = 3, n = a.length;
		for (int i = 0; i < k; i++) {
			if (i > 0 && a[i] > a[i - 1]) {
				dq.addFirst(a[i]);
			} else {
				dq.addLast(a[i]);
			}
		}
		System.out.println(dq);
		out.add(dq.getFirst());
		for (int i = k; i < n; i++) {
			dq.removeFirst();
			if (dq.getFirst() <= a[i] && dq.getLast() <= a[i]) {
				dq.clear();
			}
			if (dq.size() > 0 && dq.getFirst() <= a[i]) {
				dq.removeFirst();
			}
			if (dq.size() > 1 && dq.getLast() <= a[i]) {
				dq.removeLast();
			}
			dq.addLast(a[i]);
			out.add(dq.getFirst());
		}
		System.out.println(out);
	}

}

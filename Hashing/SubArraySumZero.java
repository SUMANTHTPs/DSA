package Hashing;

import java.util.*;

public class SubArraySumZero {

	public static void main(String[] args) {

		int[] a = new int[] { 1, 2, -1, 3, 6, -4, -4, 8, 0, 7 };
		int[] ps = new int[a.length];
		ps[0] = a[0];
		for (int i = 1; i < a.length; i++) {
			ps[i] = ps[i - 1] + a[i];
		}
		int count = 0;
		HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
		for (int i = 0; i < ps.length; i++) {
			if (h.containsKey(ps[i])) {
				h.put(ps[i], h.get(ps[i]) + 1);
			} else {
				h.put(ps[i], 1);
			}
		}
		for (int e : h.values()) {
			System.out.print(e + " ");
			count = (e > 1) ? count + e : count;
			// if(e>1) {
			// count+=e;
			// }
		}
		System.out.print(count);
	}
}

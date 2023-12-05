package Hashing;

//a[i] =a[j] and |i-j| is min
// return |i=j|
import java.util.HashMap;

public class PairEqualMax {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 1, 2, 3, 6, 4, 8, 2 };
		int max_i = -1, max_j = -1, max_diff;
		max_diff = Integer.MIN_VALUE;
		HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
		for (int i = 0; i < a.length; i++) {
			if (h.containsKey(a[i]) == false) {
				h.put(a[i], i);
			} else if (max_diff < Math.abs(i - h.get(a[i]))) {
				max_diff = Math.abs(i - h.get(a[i]));
				max_i = i;
				max_j = h.get(a[i]);
			}
		}
		System.out.println(max_diff);
		// for reference
		System.out.println(max_i);
		System.out.println(max_j);

	}

}

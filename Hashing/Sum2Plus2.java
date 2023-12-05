package Hashing;

// a + b = c+d
import java.util.ArrayList;
import java.util.HashMap;

public class Sum2Plus2 {
	public static int[] Sum4DifferenceIndex(int[] a) {
		HashMap<Integer, ArrayList<Integer>> map = new HashMap<Integer, ArrayList<Integer>>();
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				int sum = a[i] + a[j];
				if (map.containsKey(sum)) {
					int p = map.get(sum).get(0);
					int q = map.get(sum).get(1);
					if (i != q && j != p) {
						// System.out.print(true);
						return new int[] { i, j, p, q };
					}
				} else {
					ArrayList<Integer> list = new ArrayList<Integer>();
					list.add(i);
					list.add(j);
					map.put(sum, list);
				}
			}
		}
		// System.out.print(false);
		return new int[] { -1 };
	}

	public static void main(String[] args) {
		int[] a = new int[] { 1, 11, 4, 2, 3 };
		int[] result = Sum4DifferenceIndex(a);
		for (int index : result) {
			System.out.print(index + " ");
		}

	}
}

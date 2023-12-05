package Hashing;

import java.util.HashSet;

public class Sum2HashSet {

	public static void main(String[] args) {

		int k = 23;
		int[] a = { 7, 1, 14, 18, 5, 3, 6, 10 };
		HashSet<Integer> sum = new HashSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			if (sum.contains(k - a[i])) {
				System.out.print(true);
				return;
			} else {
				sum.add(a[i]);
			}
		}
		System.out.print(false);

	}

}

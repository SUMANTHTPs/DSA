package Hashing;

import java.util.HashMap;

public class SubArraySumEqualK {

	public static void main(String[] args) {

		int a[] = { 1, -2, 4, -2, 3, 5 };
		int res = 0;
		int p[] = new int[a.length];
		int sum = 2;
		p[0] = a[0];
		for (int i = 1; i < a.length; i++) {
			p[i] = p[i - 1] + a[i];
		}
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < a.length; i++) {
			if (map.containsKey(p[i] - sum)) {
				res += map.get(p[i] - sum);
			}
			map.put(p[i], map.getOrDefault(p[i], 0) + 1);
		}

		System.out.print(res);
	}
}

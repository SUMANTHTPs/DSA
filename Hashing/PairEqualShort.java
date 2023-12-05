package Hashing;
import java.util.HashMap;

public class PairEqualShort {

	public static void main(String[] args) {

		int[] a = { 2, 1, 3, 2, 1, 3 };
		int ans_i = -1, ans_j = -1, mindiff = Integer.MAX_VALUE;
		int j = 0;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < a.length; i++) {
			if (map.containsKey(a[i])) {
				j = map.get(a[i]);
				if (i - j < mindiff) {
					ans_i = i;
					ans_j = j;
					mindiff = ans_i - ans_j;
				}
			}
			map.put(a[i], i);
		}
		System.out.println(mindiff);
		System.out.println(ans_i);
		System.out.println(ans_j);

	}

}

package Sort;
import java.util.ArrayList;
import java.util.Collections;

public class SortZigZag {

	public static void main(String[] args) {

		int arr[] = { 2, 4, 3, 0, 8, 10, 6 };
		ArrayList<Integer> a = new ArrayList<>();
		ArrayList<Integer> res = new ArrayList<>();
		for (int e : arr) {
			a.add(e);
		}
		Collections.sort(a);
		int l = 0, r = a.size() - 1;
		for (int i = 0; i < a.size(); i++) {
			if (i % 2 == 0) {
				res.add(a.get(l));
				l++;
			}
			if (i % 2 != 0) {
				res.add(a.get(r));
				r--;
			}
		}
		for (int e : res) {
			System.out.print(e + " ");
		}
	}

}

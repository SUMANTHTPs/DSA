package Sort;
import java.util.ArrayList;
import java.util.Collections;

public class SortZigZagSwap {

	public static void main(String[] args) {

		int arr[] = { 2, 1, 3, 10, 20 };
		ArrayList<Integer> a = new ArrayList<>();
		for (int e : arr) {
			a.add(e);
		}
		Collections.sort(a);
		for (int i = 1; i < a.size() - 1; i++) {
			if (a.get(0) > a.get(1)) {
				Collections.swap(a, 0, 1);
			}
			if (a.get(i) < a.get(i + 1)) {
				Collections.swap(a, i, i + 1);
				i++;
			}
		}
		for (int e : a) {
			System.out.print(e + " ");
		}

	}

}

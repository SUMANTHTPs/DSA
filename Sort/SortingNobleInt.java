package Sort;
import java.util.*;

public class SortingNobleInt {

	public static int nobleInteger(ArrayList<Integer> a) {
		Collections.sort(a);
		int size = a.size();
		for (int i = 0; i < size; i++) {
			if (a.get(i) == (size - (i + 1)) && a.get(i) != a.get(i + 1)) {
				return a.get(i);
			}
		}
		return Integer.MIN_VALUE;
	}

	public static void main(String[] args) {

		int[] arr = { 4, 4, 4, 7, 10 };// not noble
		ArrayList<Integer> a = new ArrayList<Integer>();
		for (int element : arr) {
			a.add(element);
		}
		int nobleInt = nobleInteger(a);
		System.out.print(nobleInt);

	}

}

// Collections.reverse(a);
//// Reverse order
//// Collections.sort(a, Collections.reverseOrder());
// for(int element:a) {
// System.out.print(element + " ");
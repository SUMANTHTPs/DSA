package Basics;

// a[i] = a[a[i]]
// O(1) space
import java.util.Arrays;

public class RearrangeArrayAccToIndex {

	public static void main(String[] args) {
		int[] a = { 3, 2, 0, 1 };
		int i = 0;
		int n = a.length;
		for (i = 0; i < n; i++) {
			a[i] *= n;
		}
		for (i = 0; i < n; i++) {
			a[i] += a[a[i] / n] / n;
			System.out.print(a[i] + " ");
		}
		for (i = 0; i < n; i++) {
			System.out.print(a[i] % n + " ");
		}
	}
}

class Main {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int[] newArr = Arrays.copyOf(arr, arr.length);
		Arrays.setAll(newArr, i -> newArr[i] * 4);
		System.out.println(Arrays.toString(newArr)); // Output: [4, 8, 12, 16, 20]
	}
}

package Basics;

public class ShiftByK {

	public static void swap(int[] a, int l, int r) {
		int t = a[l];
		a[l] = a[r];
		a[r] = t;
	}

	public static void reverseArray(int[] a, int l, int r) {
		for (int i = l; i <= (l + r) / 2; i++) {
			swap(a, i, (l + r) - i);
		}
	}

	public static void main(String[] args) {

		int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7 };
		int k = 3;
		int n = arr.length;
		reverseArray(arr, 0, n - 1);
		reverseArray(arr, 0, k - 1);
		reverseArray(arr, k, n - 1);
		for (int ele : arr) {
			System.out.print(ele + " ");
		}
	}
}

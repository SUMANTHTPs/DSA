package Sort;

public class MergeSort {

	public static void mergeSort(int[] a, int start, int end) {
		if (end <= start)
			return;
		int mid = (start + end) / 2;
		mergeSort(a, start, mid);
		mergeSort(a, mid + 1, end);
		int[] temp = new int[end - start + 1];
		int i = 0, p1 = start, p2 = mid + 1;
		while (p1 <= mid && p2 <= end) {
			if (a[p1] <= a[p2]) {
				temp[i++] = a[p1++];
			} else {
				temp[i++] = a[p2++];
			}
		}

		// copy the remaining elements
		while (p1 <= mid) {
			temp[i++] = a[p1++];
		}

		while (p2 <= end) {
			temp[i++] = a[p2++];
		}
		int k = start;
		for(int e: temp) {
		a[k++] =e;
		}
		// for (int k = start; k <= end; k++) {
		// 	a[k] = temp[k - start];
		// }
	}

	public static void main(String[] args) {
		int[] a = { 5, 3, 6, 2, 7, 8, 9 };
		mergeSort(a, 0, a.length - 1);
		for (int i : a) {
			System.out.print(i + " ");
		}
	}
}

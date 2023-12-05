package Sort;

public class InvertionSort {

	public static int mergeSort(int[] a, int start, int end) {
		if (end - start + 1 <= 1)
			return 0;

		int mid = (start + end) / 2;
		int count = 0;
		count += mergeSort(a, start, mid);
		count += mergeSort(a, mid + 1, end);

		int[] temp = new int[end - start + 1];
		int i = 0, p1 = start, p2 = mid + 1;

		while (p1 <= mid && p2 <= end) {
			if (a[p1] <= a[p2]) {
				temp[i++] = a[p1++];
			} else {
				temp[i++] = a[p2++];
				count += 1; // Increment count for all remaining elements in the left sub array
			}
		}

		while (p1 <= mid) {
			temp[i++] = a[p1++];
		}

		while (p2 <= end) {
			temp[i++] = a[p2++];
		}

		for (int k = start; k <= end; k++) {
			a[k] = temp[k - start];
		}

		return count;
	}

	public static void main(String[] args) {
		int[] a = { 5, 1, 3, 2 };
		int count = mergeSort(a, 0, a.length - 1);
		System.out.println(count);
	}
}

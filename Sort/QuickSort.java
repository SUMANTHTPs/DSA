package Sort;


public class QuickSort {

	public static void swap(int[] a, int i1, int i2) {
		int temp = a[i1];
		a[i1] = a[i2];
		a[i2] = temp;
	}

	public static void quickSort(int[] a, int start, int end) {
		if (end < start)
			return;
		int pivot = a[end], countGreaterElementsThanPivot = 0;
		for (int i = start; i < end; i++) {
			if (a[i] > pivot)
				countGreaterElementsThanPivot++;
		}
		int pivotCrtPos = end - countGreaterElementsThanPivot;
		swap(a, end, pivotCrtPos);
		int i = start, j = end;
		while (i < j) {
			if (a[i] > pivot && a[j] < pivot) {
				swap(a, i++, j--);
			} else {
				// Only move i and j if elements are already on the correct side of the pivot.
				if (a[i] <= pivot) {
					i++;
				}
				if (a[j] >= pivot) {
					j--;
				}
			}
		}
		quickSort(a, start, pivotCrtPos - 1);
		quickSort(a, pivotCrtPos + 1, end);
	}

	public static void main(String[] args) {
		int[] a = { 3, 1, 1, 4, 2, 5, 7, 7, 6, 8, 8, 0 };
		quickSort(a, 0, a.length - 1);
		for (int e : a)
			System.out.print(e + " ");

	}

}

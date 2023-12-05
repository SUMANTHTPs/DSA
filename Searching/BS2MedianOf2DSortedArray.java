package Searching;

public class BS2MedianOf2DSortedArray {

	public static int getCountLessThanMid(int[] a, int mid) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] <= mid)
				count++;
		}
		return count;
	}

	public static void main(String[] args) {

		int[][] m = { { 1, 3, 8 },
				{ 2, 3, 4 },
				{ 1, 2, 5 } };
		int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
		for (int col = 0; col < m.length; col++) {
			if (m[col][0] < min) {
				min = m[col][0];
			}
			if (m[col][m.length - 1] > max) {
				max = m[col][m.length - 1];
			}
		}
		int row = m.length, col = m[0].length, expectedMed, count = 0;
		expectedMed = (row * col) / 2;
		System.out.println(expectedMed);
		int mid = (min + max) / 2;
		while (min <= max) {
			mid = (min + max) / 2;
			count = 0; // Reset count to 0 in each iteration
			for (int i = 0; i < m.length; i++) {
				count += getCountLessThanMid(m[i], mid);
			}
			if (count <= expectedMed) {
				min = mid + 1;
			} else {
				max = mid - 1;
			}
		}
		System.out.println(min);

	}

}

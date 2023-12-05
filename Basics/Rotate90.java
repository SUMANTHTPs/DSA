package Basics;


public class Rotate90 {

	// public static void reverseArray(int[] arr) {
	// for(int i =arr.length-1; i>=0; i--) {
	// System.out.print(arr[i]+ " ");
	// }
	// System.out.println();
	// }
	// public static void main(String[] args) {
	//
	// int[][] arr= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
	// int N= arr.length;
	// for(int i =0;i<N;i++) {
	// for(int j = i+1;j<N;j++) {
	// int t =arr[i][j];
	// arr[i][j] = arr[j][i];
	// arr[j][i] = t;
	// }
	// }
	// for(int i=0 ;i<arr.length;i++) {
	// reverseArray(arr[i]);
	// }
	// }

	public static void swap(int[][] arr, int i1, int j1, int i2, int j2) {

		int t = arr[i1][j1];
		arr[i1][j1] = arr[i2][j2];
		arr[i2][j2] = t;

	}

	public static void main(String[] args) {

		int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		int N = arr.length;
		for (int i = 0; i < N; i++) {
			for (int j = i + 1; j < N; j++) {
				swap(arr, i, j, j, i);
			}
		}
		for (int i = 0; i < N; i++) {
			for (int j = i = 0; j < N / 2; j++) {
				swap(arr, i, j, i, N - j - 1);
			}
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}

package Basics;


public class SpiralArray {
	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		int T = 0, L = 0;
		int R = arr[1].length - 1, B = arr.length - 1;
		int k;
		while (L <= R && T <= B) {
			for (k = L; k <= R; k++) {
				System.out.print(arr[T][k] + " ");
			}
			T++;
			for (k = T; k <= B; k++) {
				System.out.print(arr[k][R] + " ");
			}
			R--;
			for (k = R; k >= L; k--) {
				System.out.print(arr[B][k] + " ");
			}
			B--;
			for (k = B; k >= T; k--) {
				System.out.print(arr[k][L] + " ");
			}
			L++;
		}
	}
}

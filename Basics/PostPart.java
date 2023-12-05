package Basics;


public class PostPart {

	public static void main(String[] args) {

		int[] arr = { 0, 1, 1, 1, 1, 0, 0, 1, 1, 1, 0, 1 };
		int n = arr.length;
		int[] right = new int[n + 1];
		right[right.length - 1] = 0;
		int count = 0;
		for (int i = n - 1; i > 0; i--) {
			if (arr[i] == 1) {
				count++;
			} else {
				count = 0;
			}
			right[i] = count;
		}
		for (int i = 0; i < right.length; i++) {
			System.out.print(right[i] + " ");
		}
	}
}

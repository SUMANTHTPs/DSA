package Basics;


public class PrePart {

	public static void main(String[] args) {

		int[] Arr = { 0, 1, 1, 1, 1, 0, 0, 1, 1, 1, 0, 1 };
		int N = Arr.length;
		int[] left = new int[N + 1];
		left[0] = 0;
		int count = 0;
		for (int i = 0; i < N; i++) {
			if (Arr[i] == 1) {
				count++;
			} else {
				count = 0;
			}
			left[i + 1] = count;
		}
		for (int i = 0; i < left.length; i++) {
			System.out.print(left[i] + " ");
		}
	}
}

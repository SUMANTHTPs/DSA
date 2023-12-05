package Basics;

public class PS2Q7 {
	public static void printArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] a = { 2, 1, 6, 4 };
		int[] eps = new int[a.length];
		int[] ops = new int[a.length];
		eps[0] = a[0];
		for (int i = 1; i < a.length; i++) {
			if (i % 2 == 0) {
				eps[i] = eps[i - 1] + a[i];
			}
			if (i % 2 != 0) {
				eps[i] = eps[i - 1];
			}
		}
		ops[1] = a[1];
		for (int i = 2; i < a.length; i++) {
			if (i % 2 == 0) {
				ops[i] = ops[i - 1];
			}
			if (i % 2 != 0) {
				ops[i] = ops[i - 1] + a[i];
			}
		}
		for (int i = 1; i < a.length; i++) {
			if (eps[i - 1] + (ops[a.length - 1] - ops[i]) == (eps[a.length - 1] - eps[i]) + ops[i - 1]) {
				System.out.println(i);
				System.out.println(a[i]);
			}
		}

	}
}

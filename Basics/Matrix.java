package Basics;


public class Matrix {
	public static void main(String[] args) {
		int[][] a = { { 0, 0, 0, 1 }, { 0, 0, 1, 1 }, { 0, 1, 1, 1 }, { 1, 1, 1, 1 } };
		int i = 0, j = 0;
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 4;) {
				if (a[i][j] == 1) {
					if ((a[i + 1][j] == 1) && (a[i + 1][j - 1] == 1)) {
						j--;
						if (i < 3)
							i++;
					}
				} else {
					j++;
				}
			}

		}
		System.out.print(i);
	}
}

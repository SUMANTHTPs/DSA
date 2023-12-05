package Basics;

//i/p = [1,2,3,1,3,4,4]
//1,2,3,1,3,4,4
//smallest sub array with min and max is 
// [1,3,4]
public class SmallestSubArraySize {

	public static int min(int a, int b) {
		if (a < b) {
			return a;
		}
		return b;
	}

	public static void main(String[] args) {

		int[] a = { 4, 2, 1, 3, 2, 3, 4, 2, 1 };
		// int min_i = -a.length-1; //-infinity told but not working
		// int max_i = -a.length-1; //-infinity told but not working
		int min_i = -1;
		int max_i = -1;
		int min = a[0], max = a[0];
		int ans = Integer.MAX_VALUE;
		for (int i = 1; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
			if (a[i] > max) {
				max = a[i];
			}
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] == min) {
				min_i = i;
				// ans = min(ans, (min_i - max_i +1));
			}
			if (a[i] == max) {
				max_i = i;
				// ans = min(ans, (max_i - min_i +1));
			}
			if (min_i != -1 && max_i != -1) {
				ans = min(ans, Math.abs(max_i - min_i) + 1);
			}
		}
		System.out.println(ans);

	}

}

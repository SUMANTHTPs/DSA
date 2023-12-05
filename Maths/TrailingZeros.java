package Maths;

public class TrailingZeros {

	public static int fact(int n) {
		if (n < 2) {
			return 1;
		}
		return n * fact(n - 1);
	}

	public static int trailingZeros(int n) {
		int count = 0;
		for (int i = 5; n / i > 0; i *= 5) {
			count += n / i;
		}
		return count;
	}

	public static void main(String[] args) {
		int n = 12;
		System.out.println(fact(n));
		System.out.println(trailingZeros(n));

	}

}

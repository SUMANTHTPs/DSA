package Basics;

public class PS2Q6 {

	public static void main(String[] args) {

		Integer[] arr = { -7, 1, 5, 2, -4, 3, 0 };
		int Sl = 0, Sr = 0;
		for (int i = 0; i < arr.length; i++) {
			if (Sl == Sr + arr[i]) {
				System.out.println(arr[i]);
				System.out.println(i);
			} else {
				Sl = Sl - arr[i];
				Sr = Sr + arr[i];
			}
		}

	}

}

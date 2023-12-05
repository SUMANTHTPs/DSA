package Basics;

import java.util.Scanner;

public class ExcelColumnNumber {

	public static int colToNumber(String s) {
		int result = 0;
		s = s.toUpperCase();
		System.out.println(s);
		for (int i = 0; i < s.length(); i++) {
			result = result * 26 + (s.charAt(i) - 'A' + 1);
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		String s = inp.nextLine();
		System.out.println(colToNumber(s));
		inp.close();
	}

}

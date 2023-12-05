package Basics;


public class StringReverse {

	public static String swapChars(String str, int index1, int index2) {
		char[] charArray = str.toCharArray();
		System.out.println(charArray);
		char temp = charArray[index1];
		charArray[index1] = charArray[index2];
		charArray[index2] = temp;
		return new String(charArray);
	}

	public static void main(String[] args) {

		String s = "sushmitha";
		for (int i = 0; i <= s.length() / 2; i++) {
			s = swapChars(s, i, s.length() - i - 1);
		}
		System.out.print(s);
	}
}

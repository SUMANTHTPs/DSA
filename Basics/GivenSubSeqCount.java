package Basics;

// str = "abcgag"
// subseq = "ag"
// answer: 3

public class GivenSubSeqCount {

	public static void main(String[] args) {
		String s = "abcgag";
		int a_count = 0, ans = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a') {
				a_count++;
			}
			if (s.charAt(i) == 'g') {
				ans += a_count;
			}
		}
		System.out.print(ans);
	}
}

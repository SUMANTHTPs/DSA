package Sort;
import java.util.*;

public class SortingMinDiffPairs {

	public static ArrayList<Integer> minDiffPair(ArrayList<Integer> a) {
		int mindiff = Integer.MAX_VALUE;
		ArrayList<Integer> res = new ArrayList<>();
		res.sort(Comparator.naturalOrder());
		Collections.sort(a);
		for (int i = 0; i < a.size() - 1; i++) {
			int diff = a.get(i + 1) - a.get(i);
			if (diff < mindiff) {
				res.clear();
				mindiff = diff;
				res.add(a.get(i));
				res.add(a.get(i + 1));
			} else if (diff == mindiff) {
				res.add(a.get(i));
				res.add(a.get(i + 1));
			}
		}
		for (int e : res) {
			System.out.print(e + " ");
		}
		return res;
	}

	public static void main(String[] args) {

		int arr[] = { 3, 1, 5, 6, 7 };
		ArrayList<Integer> a = new ArrayList<>();
		for (int ele : arr) {
			a.add(ele);
		}
		minDiffPair(a);

	}

}

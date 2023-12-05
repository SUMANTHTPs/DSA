package Hashing;

import java.util.HashMap;

public class LeetCode2Sum {

	public static int[] twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> sum = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (sum.containsKey(target - nums[i])) {
				return new int[] { sum.get(target - nums[i]), i };
			} else {
				sum.put(nums[i], i);
			}
		}
		return new int[] { -1, -1 };
	}

	public static void main(String[] args) {

		int[] a = { 3, 3 };
		int target = 6;
		int[] x = twoSum(a, target);
		for (int i : x) {
			System.out.print(i + " ");
		}
	}
}

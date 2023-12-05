
package Searching.BinarySearch;

// Pg-138
public class AnswerspaceQ1 {
    public static void main(String[] args) {
        int[] a = { -1, -5, -3, -7 };
        int sum1 = -10, k1 = 0, k2 = a.length, ans = 0, sum2 = 0;
        while (k1 <= k2) {
            int mid = (k1 + k2) / 2;
            sum2 = 0;
            for (int i = 0; i < mid; i++) {
                sum2 += a[i];
                if (sum2 > sum1) {
                    k2 = mid - 1;
                    break;
                }
            }
            for (int i = mid; i < a.length; i++) {
                sum2 = sum2 + a[i] - a[i - mid];
                if (sum2 > sum1) {
                    k2 = mid - 1;
                    break;
                }
            }
            if (sum2 < sum1) {
                ans = mid;
                k1 = mid + 1;
            }
        }
        System.out.println(ans);
    }

}

// Not working, too many edge cases required

// package Searching;

// public class BinarySearchQ1 {
// public static int bsInUnasortedArray(int[] a) {
// if (a[0] != a[1])
// return a[0];
// if (a[a.length - 1] != a[a.length - 2]) {
// return a[a.length - 1];
// }
// int l = 1, h = a.length - 2, toCheck = -1, mid = 0, ans = -1;
// while (l <= h) {
// mid = (l + h) / 2;
// System.out.println("Values");
// System.out.println("mid: " + mid);
// System.out.println(l);
// System.out.println(h);
// if (mid % 2 == 0) {
// if (a[mid] != a[mid + 1]) {
// ans = mid;
// }

// }

// }

// return a[ans];
// }

// public static void main(String[] args) {
//
// int[] a = { 2, 2, 4, 4, 5, 5, 8, 8, 6, 6, 7, 9, 9 };
// System.out.println(bsInUnasortedArray(a));

// }

// }

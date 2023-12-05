package Hashing;

import java.util.HashMap;
import java.util.Map.Entry;

public class orderStringInGivenForm {
    // public static void main(String[] args) {
    //     String s = "sushu";
    //     String format = "uhs";
    //     HashMap<Character, Integer> h = new HashMap<Character, Integer>();
    //     for (char c : s.toCharArray()) {
    //         if (h.containsKey(c)) {
    //             h.put(c, h.get(c) + 1);
    //         } else {
    //             h.put(c, 1);
    //         }
    //     }
    //     // for (Entry<Character, Integer> e : h.entrySet()) {
    //     // System.out.print(e.getKey() + " ");
    //     // System.out.println(e.getValue());
    //     // }

    //     String res = "";
    //     for (char c : format.toCharArray()) {
    //         if (h.containsKey(c)) {
    //             for (int i = 0; i < h.get(c); i++) {
    //                 res = res + c;
    //             }
    //         }
    //     }
    //     System.out.println(res);
    // }

    public static void main(String[] args) {
        String s = "sushu";
        String format = "uhs";

        // Use an array to count character occurrences
        int[] charCount = new int[26];

        for (char c : s.toCharArray()) {
            charCount[c - 'a']++;
        }

        StringBuilder res = new StringBuilder();
        for (char c : format.toCharArray()) {
            int count = charCount[c - 'a'];
            while (count-- > 0) {
                res.append(c);
            }
        }

        System.out.println(res.toString());

    }
}

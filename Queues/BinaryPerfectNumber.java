package Queues;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// Get n, find the nth perfect number
// Perfect number: should be formed from only 1 and 2, should be of even length and it should palindrome

public class BinaryPerfectNumber {
    public static int getBinaryPerfectNumber(int n) {
        Queue<String> q = new LinkedList<>();
        List<String> res = new ArrayList<>();
        q.add("1");
        q.add("2");
        res.add("1");
        res.add("2");
        int count = 2;
        while (count <= n) {
            String current = q.remove();
            q.add(current + "1");
            q.add(current + "2");
            res.add(current + "1");
            res.add(current + "2");
            count +=2;
        }
        int ans = Integer.parseInt(res.get(n-1) + new StringBuilder(res.get(n-1)).reverse());
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(getBinaryPerfectNumber(6));
    }
}



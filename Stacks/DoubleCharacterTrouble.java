// Given a string operation. 
// Perform an operation
// Remove first pair of consecutive characters which are equal 
// i: abbcd : acd
// i2: abbbd : abd

package Stacks;

import java.util.Stack;

public class DoubleCharacterTrouble {
    public static String helpDoubleCharacterTrouble(String s) {
        Stack<Character> st = new Stack<>();
        String res = "";
        for (char e : s.toCharArray()) {
            if (!st.isEmpty() && st.peek() == e) {
                st.pop();
            } else {
                st.push(e);
            }
        }
        while(!st.isEmpty()) {
            res= res + st.pop();
        }
        StringBuilder revString = new StringBuilder(res).reverse();
        //System.out.println(revString);
        return revString.toString();
    }

    public static void main(String[] args) {
        String str = "abbbd";
        helpDoubleCharacterTrouble(str);
    }
}

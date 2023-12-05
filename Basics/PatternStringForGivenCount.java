package Basics;

//  Repeat string for forward and reverse pattern for the count given.

public class PatternStringForGivenCount {

    public static void repeatingString(String s, int count) {
        // int i=0,j=0,k=0;

    }

    public static void main(String[] args) {
        String input = "ABCD";
        StringBuilder builder = new StringBuilder(input);
        String reverse = builder.reverse().toString();
        String pattern = input + reverse.substring(1);
        int repeatCount = 10;
        StringBuilder resultBuilder = new StringBuilder();
        resultBuilder.append(pattern);
        for (int i = 0; i < repeatCount; i++) {
            resultBuilder.append(pattern.substring(1));
        }
        String output = resultBuilder.toString();
        System.out.println(output);
    }
}

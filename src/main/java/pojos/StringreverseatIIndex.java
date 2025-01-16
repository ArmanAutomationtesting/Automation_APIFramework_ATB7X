package pojos;

import java.util.Arrays;

public class StringreverseatIIndex {

    public static String reverseString(String input) {
        if (input == null || input.length() == 0) {
            return input;
        }
        String[] reverseEachwords = input.split(" ");

        for (int i = 0; i < reverseEachwords.length; i++) {
            if (i == 1 || i == 3) {
                reverseEachwords[i] = new StringBuilder(reverseEachwords[i]).reverse().toString();
            }
        }
        StringBuilder outputString = new StringBuilder();
        for (int i = reverseEachwords.length - 1; i >= 0; i--) {
            outputString.append(reverseEachwords[i]);
            if (i != 0) {
                outputString.append(" ");
            }
        }
        return outputString.toString();
    }

    public static void main(String[] args) {
        String input = "I Love My Country";
        System.out.println("Input String is  = " + input);
        System.out.println("Output String is  = " + reverseString(input));
    }
}



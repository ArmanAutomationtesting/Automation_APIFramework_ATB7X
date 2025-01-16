import org.apache.commons.collections4.map.HashedMap;

import javax.smartcardio.ATR;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class primeNumber {
    public static Boolean isPrime(int num) {
//        if (num <= 1) {
//            System.out.println(num + " = "  +"it is not a prime number");
//        }
        for (int i = 2; i < Math.sqrt(num); i++) {

            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void Primeok(int[] arr) {
        ArrayList<Integer> integers = new ArrayList<>();
        System.out.println("Prime number are ");
        for (int num : arr) {
            if (!integers.contains(num)) {
                if (isPrime(num)) {
                    System.out.println(num);
                }
                integers.add(num);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 45, 3, 5, 78, 56, 55, 45, 678, 9};
        Primeok(arr);
    }
//        primeNumber primeNumber = new primeNumber();
//        System.out.println(primeNumber.romanToDecimal("IIVX"));
//    }
//
//    public static String reverseWords(String s) {
//        String[] splitString = s.split(" ");
//       String finalString  = "";
//        for(int i = splitString.length-1; i>=0;i--){
//            finalString+=splitString[i]+" ";
//        }
//        return finalString;
//    }


    //    public int romanToDecimal(String s) throws IndexOutOfBoundsException {
//        HashedMap<Character, Integer> Map = new HashedMap<>();
//        Map.put('I', 1);
//        Map.put('V', 5);
//        Map.put('X', 10);
//        Map.put('L', 50);
//        Map.put('C', 100);
//        Map.put('D', 500);
//        Map.put('M', 1000);
//
//        int number = 0;
//
//        for (int i = s.length() - 1; i >= 0; i--) {
//            if (i < s.length() - 1) {
//                if (Map.get(s.charAt(i)) <= Map.get(s.charAt(i + 1))) {
//                    number -= Map.get(s.charAt(i));
//                } else {
//                    number += Map.get(s.charAt(i));
//                }
//            } else {
//                number = Map.get(s.charAt(i));
//            }
//
//        }
//        return number;
//    }
//
//    //    aaaddcejfff
//    public static void main(String[] args) {
//        String s = "I Love My India";
//        StringBuilder output = new StringBuilder();
//        int count = 1;
//        for (int i = 1; i <= input.length(); i++) {
//            if (i < input.length() && input.charAt(i) == input.charAt(i - 1)) {
//                count++;
//            } else {
//                output.append(input.charAt(i - 1));
//                if (count > 1) {
//                    output.append(count);
//                }
//                count = 1;
//            }
//        }
//        System.out.println(output.toString());
//        String string = "aabbddiurryy";
//        char[] arman = string.toCharArray();
//        StringBuilder stringBuilder = new StringBuilder();
//        for (int i = arman.length - 1; i >= 0; i--) {
//            stringBuilder.append(string.charAt(i));
//        }
//      //  System.out.println(stringBuilder.toString());

//        String s1 = reverseWords(s).trim();
//        System.out.println(s1);

//        HashedMap<Character, String> numberToName = new HashedMap();
//        int number123 = 78272;
//        numberToName.put('1', "one");
//        numberToName.put('2', "Two");
//        numberToName.put('3', "Three");
//        numberToName.put('4', "Four");
//        numberToName.put('5', "Five");
//        numberToName.put('6', "Six");
//        numberToName.put('7', "Seven");
//        numberToName.put('8', "Eight");
//        numberToName.put('9', "Nine");
//        String numberString = Integer.toString(number123);
//
//        // Initialize an Integer array
////        Integer[] integerArray = new Integer[numberString.length()];
//
//        // Populate the array by converting each character to an Integer
////        for (int i = 0; i < numberString.length(); i++) {
////            integerArray[i] = Character.getNumericValue(numberString.charAt(i));
////        }
//        char[] nameChar = numberString.toCharArray();
//        for (char i = 0; i < nameChar.length; i++) {
//            System.out.print(numberToName.get(numberString.charAt(i)));
//            System.out.print(" ");
//        }
//
//    }

}

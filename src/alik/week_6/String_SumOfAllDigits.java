package alik.week_6;

import java.util.Arrays;

/**
 * Java Coding Tasks - Week6
 * <p>
 * String_SumOfAllDigits
 * Write a method that can return the sum of the digits in a string
 * Ex:  "12 java 5 apple 3"  ==>  20
 */

public class String_SumOfAllDigits {

    public static int sum1(String str) {
        String[] words = str.split(" ");
        int result = 0;
        for (String word : words) {
            try {
                result += Integer.parseInt(word);
            } catch (NumberFormatException e) {
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(sum1("12 java 5 apple 3"));
    }
}

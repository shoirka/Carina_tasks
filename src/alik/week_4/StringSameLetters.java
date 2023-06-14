package alik.week_4;

import java.util.Arrays;

/**
 *   String - Same letters
 * Write a return method that checks if a string is built out of the same letters as another string.
 *   Ex: same("abc", "cab"); ==> true
 *       same("abc", "abb"); ==> false
 */
public class StringSameLetters {
    public static boolean same(String str1, String str2) {
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        System.out.println(same("abc", "cab"));
        System.out.println(same("abc", "abb"));
    }
}

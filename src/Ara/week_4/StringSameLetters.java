package Ara.week_4;

import java.util.Arrays;

/**
 *   String - Same letters
 * Write a return method that checks if a string is built out of the same letters as another string.
 *   Ex: same("abc", "cab"); ==> true
 *       same("abc", "abb"); ==> false
 */
public class StringSameLetters {

    public static boolean sameLetters(String str1, String str2){


        char[] newArr1 = str1.toCharArray();
        char[] newArr2 = str2.toCharArray();

        Arrays.sort(newArr1);
        Arrays.sort(newArr2);

        boolean isSameLetters = Arrays.equals(newArr1,newArr2);

        return isSameLetters;

    }

    public static void main(String[] args) {

        boolean ex1= sameLetters("abc", "cab");
        boolean ex2 = sameLetters("abc", "aab");

        System.out.println("ex1 = " + ex1);
        System.out.println("ex2 = " + ex2);

    }

}

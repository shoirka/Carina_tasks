package alik.week_5;

import java.util.Arrays;

/**
 *   String_Reverse
 * Write a return method that can reverse  String
 * Ex: Reverse("ABCD"); ==> DCBA
 */
public class String_Reverse {

    public static String reverse(String str) {
        StringBuilder result = new StringBuilder();
        for (int i=str.length()-1; i>=0; i--) {
            result.append(str.charAt(i));
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverse("ABCD"));
    }

}

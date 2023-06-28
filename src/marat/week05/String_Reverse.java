package marat.week05;

/**
 * String_Reverse
 * Write a return method that can reverse  String
 * Ex: Reverse("ABCD"); ==> DCBA
 */
public class String_Reverse {
    public static String reverse(String word) {
        String result = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            result += "" + word.charAt(i);
        }
        return result;
    }
}

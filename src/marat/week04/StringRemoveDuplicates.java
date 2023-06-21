package marat.week04;

/**
 * String - Remove Duplicates
 * Write a return method that can remove the duplicated values from the String
 * Ex: removeDup("AAABBBCCC") ==> ABC
 */
public class StringRemoveDuplicates {
    public static String removeDuplicates(String word) {
        String result = "";
        for (int i = 0; i < word.length(); i++) {
            if (!result.contains("" + word.charAt(i))) {
                result += "" + word.charAt(i);
            }
        }
        return result;
    }
}

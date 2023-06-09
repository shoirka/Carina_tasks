package alik.week_4;

/**
 * String - Remove Duplicates
 * Write a return method that can remove the duplicated values from the String
 * Ex: removeDup("AAABBBCCC") ==> ABC
 */
public class StringRemoveDuplicates {
    public static String removeDuplicates(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }

        StringBuilder result = new StringBuilder();

        char currentChar = str.charAt(0);
        for (int i = 1; i <= str.length(); i++) {
            if (i == str.length() || str.charAt(i) != currentChar) {
                result.append(currentChar);
                if (i < str.length()) {
                    currentChar = str.charAt(i);
                }

            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates("AAABBBCCC"));
    }
}

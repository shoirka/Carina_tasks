package alik.week_4;

/**
 * String - Frequency of Characters
 * Write a return method that can find the frequency of characters
 * Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */
public class StringFrequencyOfCharacters {

    public static String frequency(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }

        StringBuilder result = new StringBuilder();

        int count = 0;
        char currentChar = str.charAt(0);
        for (int i = 0; i <= str.length(); i++) {
            if (i == str.length() || str.charAt(i) != currentChar) {
                result.append(currentChar);
                result.append(count);
                count = 1;
                if (i < str.length()) {
                    currentChar = str.charAt(i);
                }
            } else {
                count++;
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(frequency("AAABBCDD"));
    }


}

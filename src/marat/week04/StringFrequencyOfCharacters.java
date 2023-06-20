package marat.week04;

/**
 * String - Frequency of Characters
 * Write a return method that can find the frequency of characters
 * Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */
public class StringFrequencyOfCharacters {
    public static String freqOfChars(String word) {
        String result = "";
        for (int i = 0; i < word.length(); i++) {
            int count = 0;
            for (int j = 0; j < word.length(); j++) {
                if (word.charAt(i) == word.charAt(j)) {
                    count++;
                }
            }
            if (!result.contains("" + word.charAt(i))) {
                result += "" + word.charAt(i) + count;
            }
        }
        return result;
    }
}

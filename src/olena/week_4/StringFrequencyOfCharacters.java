package olena.week_4;

import java.util.HashMap;
import java.util.Map;

/**
 *   String - Frequency of Characters
 * Write a return method that can find the frequency of characters
 *   Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */
public class StringFrequencyOfCharacters {
    public static class FrequencyOfChars {

        public static Map<Character, Integer> getFrequency(String input) {
            Map<Character, Integer> frequencies = new HashMap<>();
            for (char ch : input.toCharArray()) {
                frequencies.put(ch, frequencies.getOrDefault(ch, 0) + 1);
            }
            return frequencies;
        }

        public static void main(String[] args) {
            String input = "AAABBCDD";
            Map<Character, Integer> frequencies = getFrequency(input);
            for (Map.Entry<Character, Integer> entry : frequencies.entrySet()) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }
    }
}



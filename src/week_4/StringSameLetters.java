package week_4;

import java.util.HashMap;
import java.util.Map;

/**
 * String - Same letters
 * Write a return method that checks if a string is built out of the same letters as another string.
 * Ex: same("abc", "cab"); ==> true
 * same("abc", "abb"); ==> false
 */
public class StringSameLetters {
    public static boolean charFrequency(String str1, String str2) {
        if (str1 == null || str2 == null) {
            throw new IllegalArgumentException();
        }
        if (str1.length() != str2.length()) {
            return false;
        }

        String[] chars1 = str1.split("");
        Map<String, Integer> map1 = new HashMap<>();

        String[] chars2 = str2.split("");
        Map<String, Integer> map2 = new HashMap<>();

        for (int i = 0; i < str1.length(); i++) {
            if (!map1.containsKey(chars1[i])) {
                map1.put(chars1[i], 1);
            } else {
                int currentCount = map1.get(chars1[i]);
                currentCount++;
                map1.replace(chars1[i], currentCount);
            }

            if (!map2.containsKey(chars2[i])) {
                map2.put(chars2[i], 1);
            } else {
                int currentCount = map2.get(chars2[i]);
                currentCount++;
                map2.replace(chars2[i], currentCount);
            }
        }
        return map1.equals(map2);

    }


    public static void main(String[] args) {
        System.out.println(charFrequency("abc", "cab"));
        System.out.println(charFrequency("abc", "abb"));
        System.out.println(charFrequency("aaasdf", "asdf"));
        System.out.println(charFrequency("aaasdf", "fdsaaa"));
    }

}

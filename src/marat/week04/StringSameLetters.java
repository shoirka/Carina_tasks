package marat.week04;

/**
 * String - Same letters
 * Write a return method that checks if a string is built out of the same letters as another string.
 * Ex: same("abc", "cab"); ==> true
 * same("abc", "abb"); ==> false
 */
public class StringSameLetters {
    public static boolean same(String word1, String word2) {
        for (int i = 0; i < word1.length(); i++) {
            int count = 0;
            for (int j = 0; j < word2.length(); j++) {
                if (word1.charAt(i) == word2.charAt(j)) {
                    count++;
                }
            }
            if (count == 0) {
                return false;
            }
        }
        for (int i = 0; i < word2.length(); i++) {
            int count = 0;
            for (int j = 0; j < word1.length(); j++) {
                if (word2.charAt(i) == word1.charAt(j)) {
                    count++;
                }
            }
            if (count == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(same("Abc", "cab"));
        System.out.println(same("abc", "baca"));
    }
}

package oleh_k.week_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * String_UniqueCharacters
 * Write a return  method that can find the unique characters from the String
 * Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";
 */
public class String_UniqueCharacters {
    public static String uniqueCharacter(String str) {
        String[] arr = str.split("");
        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));
        StringBuilder result = new StringBuilder();
        for (String eachLetter : list) {
            if (Collections.frequency(list, eachLetter) == 1) {
                result.append(eachLetter);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String[] words = {"hello", "AAABBBCCCDEF"};
        for (String each : words) {
            System.out.println(uniqueCharacter(each));
        }
    }
}

package week_4;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * String - Frequency of Characters
 * Write a return method that can find the frequency of characters
 * Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */
public class StringFrequencyOfCharacters {

    public static String charFrequency(String str) {
        if (str.isBlank() || str == null) {
            throw new IllegalArgumentException();
        }

        String[] chars = str.split("");
        Map<String, Integer> map = new LinkedHashMap<>();

        for (String ch : chars) {
            if (!map.containsKey(ch)) {
                map.put(ch, 1);
            } else {
                int currentCount = map.get(ch);
                currentCount++;
                map.replace(ch, currentCount);
            }
        }
        return map.toString()
                .replace("{","")
                .replace("}","")
                .replace("=","")
                .replace(" ","")
                .replace(",","");



    }


    public static void main(String[] args) {
        String str="AAABBCDD";
        System.out.println("Before: "+str);
        System.out.println("After: "+charFrequency(str));
    }


}

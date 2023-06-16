package week_4;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 *   String - Remove Duplicates
 * Write a return method that can remove the duplicated values from the String
 *   Ex: removeDup("AAABBBCCC") ==> ABC
 */
public class StringRemoveDuplicates {
    public static String removeDuplicates(String str) {
        if (str.isBlank() || str == null) {
            throw new IllegalArgumentException();
        }

        String[] chars = str.split("");
        Map<String, Integer> map = new LinkedHashMap<>();

        for (String ch : chars) {
            if (!map.containsKey(ch)) {
                map.put(ch, 1);
            }
        }
        return map.toString()
                .replace("{","")
                .replace("}","")
                .replace("=","")
                .replace(" ","")
                .replace(",","")
                .replace("1","");



    }


    public static void main(String[] args) {
        String str="AAABBBCCC";
        System.out.println("Before: "+str);
        System.out.println("After: "+ removeDuplicates(str));
    }
}

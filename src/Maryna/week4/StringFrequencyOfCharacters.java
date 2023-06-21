package Maryna.week4;
/*
 * Write a return method that can find the frequency of characters
 *   Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */


import java.util.LinkedHashMap;
import java.util.Map;

public class StringFrequencyOfCharacters {
    public static void main(String... maryna) {
        String input = "AAABBCDD";
        System.out.println("Our input is \n" + input);
        System.out.println("Frequency of characters \n" + freqOfChar(input));
    }

    //using ASCII table
    public static String freqOfChar(String input) {
        //Assume that all chars from String input are in ASCII table.
        //Create int array ascii, each element of which corresponds
        // to the char from ASCII table (from 0 to 127)
        int[] ascii = new int[128];
        String output = "";
        for (int i = 0; i < input.length(); i++) {
            //add 1 to corresponding element from ascii array for each of our characters
            ascii[(int) input.charAt(i)] += 1;
        }
        for (int i=0;i<ascii.length;i++) {
            //iterate through ascii array and
            //add frequencies different from 0 to our String output
            if (ascii[i]!=0) output+=(char)i+""+ascii[i];
        }
        return output;
    }

    //using 2 nested loops
    public static String freqOfChar1(String input) {
        String output = "";
        for (int i = 0; i < input.length(); i++) {
            int frequencyOfCurrentChar = 0;
            char currentChar = input.charAt(i);
            for (int j = 0; j < input.length(); j++) {
                //if we already counted this char, then continue
                if (output.contains(currentChar + "")) continue;
                if (currentChar == input.charAt(j)) frequencyOfCurrentChar++;
            }
            //if we already counted this char, then continue
            if (frequencyOfCurrentChar == 0) continue;
            output += Character.toString(currentChar) + frequencyOfCurrentChar;
        }
        return output;
    }

    //using Map
    public static String freqOfChar2(String input) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        String output = "";
        for (char currentChar : input.toCharArray()) {
            map.put(currentChar, map.getOrDefault(currentChar, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            output += Character.toString(entry.getKey()) + entry.getValue();
        }
        return output;
    }



}

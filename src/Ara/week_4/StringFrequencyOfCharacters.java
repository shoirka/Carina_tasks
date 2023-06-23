package Ara.week_4;

/**
 *   String - Frequency of Characters
 * Write a return method that can find the frequency of characters
 *   Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */
public class StringFrequencyOfCharacters {

    public static String frequency(String str) {

        String noDup = "";

        for (int i = 0; i < str.length(); i++) {

            if (!noDup.contains("" + str.charAt(i))) {
                noDup += str.charAt(i);
            }
        }

        String result = "";

        for (int j = 0; j < noDup.length(); j++) {

            result += noDup.charAt(j);

            int count = 0;
            for (int z = 0; z < str.length(); z++) {
                if (str.charAt(z) == noDup.charAt(j))
                    count++;
            }
            result += count;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(frequency("AAABBCDD"));
        System.out.println(frequency("AAAAABBCDD"));
    }

}

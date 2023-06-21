package olena.week_4;

/**
 *   String - Remove Duplicates
 * Write a return method that can remove the duplicated values from the String
 *   Ex: removeDup("AAABBBCCC") ==> ABC
 */
public class StringRemoveDuplicates {

    public static void main(String[] args) {
        System.out.println(removeDup("prroggramm"));
    }
    public static String removeDup(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (!result.contains(String.valueOf(str.charAt(i)))) {
                result += str.charAt(i);
            }
        }
        return result;
    }


}

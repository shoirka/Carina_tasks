package Maryna.week4;

/**
 * String - Remove Duplicates
 * Write a return method that can remove the duplicated values from the String
 * Ex: removeDup("AAABBBCCC") ==> ABC
 */
public class StringRemoveDuplicates {
    public static void main(String[] args) {
        String input = "AAABBBCCC";
        System.out.println("Our input is \"" + input + "\"");
        System.out.println("After removing duplicates \"" + removeDup(input) + "\"");
    }

    public static String removeDup(String input) {
        String output = input;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            //while output contains double char, replace it with single
                while (output.contains(ch + "" + ch))
                output=output.replace(ch + "" + ch, ch + "");
        }
        return output;
    }

}

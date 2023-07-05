package alik.week_5;

/**
 * String_UniqueCharacters
 * Write a return  method that can find the unique characters from the String
 * Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";
 */
public class String_UniqueCharacters {

    public static String unique(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int first = str.indexOf(ch);
            int next = str.indexOf(ch, first +1 );
            if (next == -1) {
                result.append(ch);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(unique("AAABBBCCCDEF"));
    }

}

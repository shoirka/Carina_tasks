package olena.week_5;
/**
 *   String_UniqueCharacters
 * Write a return  method that can find the unique characters from the String
 * Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";
 */
public class String_UniqueCharacters {

    public static String uniqueChar(String str){

        String uniqueStr = "";

        for (int i = 0; i <= str.length()-1; i++) {
        if (! uniqueStr.contains(""+str.charAt(i))){
            uniqueStr += str.charAt(i);
        }
           }
        return uniqueStr;

    }

    public static void main(String[] args) {
        System.out.println(uniqueChar("mississippi!!"));
    }
}

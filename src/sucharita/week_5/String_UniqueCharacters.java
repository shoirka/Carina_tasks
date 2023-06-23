package sucharita.week_5;
/**
 *   String_UniqueCharacters
 * Write a return  method that can find the unique characters from the String
 * Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";
 */
public class String_UniqueCharacters {

    public static String uniqueChar(String str){
        String result="";

        for (int i = 0; i < str.length(); i++) {
            char each=str.charAt(i);

            if(str.indexOf(each)==str.lastIndexOf(each)){
                result +=each;
            }

        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("uniqueChar(\"aaabccdeee\") = " + uniqueChar("aaabccdeee"));
    }
}

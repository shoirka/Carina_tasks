package Ara.week_5;
/**
 *   String_UniqueCharacters
 * Write a return  method that can find the unique characters from the String
 * Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";
 */
public class String_UniqueCharacters{

    public static String uniqueCharacters(String str){

        String uniqueChar = "";

        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length() ; j++) {
               if(str.charAt(i) == str.charAt(j)){
                   count++;
               }
            }

            if(count==1){
                uniqueChar += str.charAt(i);
            }
        }

        return uniqueChar;

    }



    public static void main(String[] args) {

        System.out.println("uniqueCharacters(\"AAABBBCCCDEF\") = " + uniqueCharacters("AAABBBCCCDEF"));
        System.out.println("uniqueCharacters(\"Configuration\") = " + uniqueCharacters("Configuration"));

    }

}

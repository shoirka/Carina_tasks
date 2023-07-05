package Ara.week_4;

/**
 *   String - Remove Duplicates
 * Write a return method that can remove the duplicated values from the String
 *   Ex: removeDup("AAABBBCCC") ==> ABC
 */
public class StringRemoveDuplicates {

    public static String removeDuplicates(String str){

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            if ( !result.contains(""+ str.charAt(i) )){
                result+=""+str.charAt(i);
            }
           }

        return result;
    }


    public static void main(String[] args) {

        System.out.println(removeDuplicates("aaabbbccc"));

    }

}

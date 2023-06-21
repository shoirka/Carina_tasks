package sucharita.week_4;

/**
 *   String - Remove Duplicates
 * Write a return method that can remove the duplicated values from the String
 *   Ex: removeDup("AAABBBCCC") ==> ABC
 */
public class StringRemoveDuplicates {
    public static String removeDuplicate(String str){
        String result="";
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            if(!result.contains(ch+"")){
                result +=ch;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(removeDuplicate("AAABBBCCCDDD"));


    }


}

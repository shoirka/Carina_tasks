package Ara.week_5;

/**
 *   String_Reverse
 * Write a return method that can reverse  String
 * Ex: Reverse("ABCD"); ==> DCBA
 */
public class String_Reverse {

    public static String reverse (String str){

        String reverse = "";

        for (int i = str.length()-1; i >=0 ; i--) {    // last index of str is -> str.length()-1

            reverse += ""+ str.charAt(i);
        }

        return reverse;
    }


    public static void main(String[] args) {

        System.out.println("reverse(\"ABCDEFG\") = " + reverse("ABCDEFG"));

    }
}

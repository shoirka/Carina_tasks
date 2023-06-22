package olena.week_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *   String_Reverse
 * Write a return method that can reverse  String
 * Ex: Reverse("ABCD"); ==> DCBA
 */
public class String_Reverse {

        public static String reverse(String str){

            String reversedStr = "";

            for (int i = str.length()-1; i >=0 ; i--) {
                reversedStr += str.charAt(i);
            }
            return reversedStr;
    }

    public static void main(String[] args) {

        System.out.println("Reversed String = " + String_Reverse.reverse("AARON"));


    }


}

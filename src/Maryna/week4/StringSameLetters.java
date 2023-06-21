package Maryna.week4;

import static Maryna.week4.StringFrequencyOfCharacters.freqOfChar;
/**
 *   String - Same letters
 * Write a return method that checks if a string is built out of the same letters as another string.
 *   Ex: same("abc", "cab"); ==> true
 *       same("abc", "abb"); ==> false
 */
public class StringSameLetters {
    public static void main(String[] args) {
        String input1="abc", input2="cab",
                input3="aab";
        System.out.println("Strings \""+input1+"\""+"and \""+input2+"\" same? "+
                same(input1,input2));
        System.out.println("Strings \""+input1+"\""+"and \""+input3+"\" same? "+
                same(input1,input3));
    }

    public static boolean same(String a,String b){
        //we can reuse our method freqOfChar from StringFrequencyOfCharacters Class
        String freqA=freqOfChar(a);
        String freqB=freqOfChar(b);
        //if frequencies are equal -- return true, otherwise false
        return freqA.equals(freqB);
    }
}

package sucharita.week_5;

/**
 *   String_Reverse
 * Write a return method that can reverse  String
 * Ex: Reverse("ABCD"); ==> DCBA
 */
public class String_Reverse {

    public static String reverse(String str) {
        String reverse = "";//to contain all the characters of the given string in reverse
        for (int i = str.length() - 1; i >= 0; i--) {//i: index number of the given String starting from last index to index 0
            reverse += str.charAt(i);//to get each character of the String starting from last index to index zero
        }
        return reverse;
    }

    public static String revStr(String str){
        String reverse="";
        for (int i = 0; i < str.length(); i++) {
            reverse=str.charAt(i)+reverse;
        }
        return reverse;
    }

    public static void main(String[] args) {
        System.out.println("reverse(\"sucharita\") = " + reverse("sucharita"));
    }
}

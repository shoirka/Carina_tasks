package Maryna.week5;

public class String_reverse {
    /* Write a return method that can reverse  String
     * Ex: Reverse("ABCD"); ==> DCBA
     */


    public static String string_Reverse(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);

        }
        return reverse;
    }

    public static void main(String[] args) {
        System.out.println("string_Reverse = " + string_Reverse("doG"));
    }
}

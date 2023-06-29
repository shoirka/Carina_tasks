package julia.week5;

public class StringReverse {
    public static String reverse(String string) {
        String reverse = "";

        for (int i = string.length() - 1; i >= 0; i--) {
            reverse += string.charAt(i);
        }

        return reverse;

    }

    public  static String  Reverse(String str) {

        return new StringBuffer(str).reverse().toString();
    }


    public static void main(String[] args) {

        // System.out.println("reverse(\"java\") = " + reverse("java"));
        System.out.println("Reverse(\"palindrome\") = " + Reverse("palindrome"));
        System.out.println("reverse(\"massachusetts\") = " + reverse("massachusetts"));

    }
}


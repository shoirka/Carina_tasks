package julia.week5;

public class StringReverse {
    public static String reverse(String string) {
        String reverse = "";

        for (int i = string.length() - 1; i >= 0; i--) {
            reverse += string.charAt(i);
        }

        return reverse;

    }

    public static void main(String[] args) {

        // System.out.println("reverse(\"java\") = " + reverse("java"));
        // System.out.println("reverse(\"palindrome\") = " + reverse("palindrome"));
        System.out.println("reverse(\"massachusetts\") = " + reverse("massachusetts"));

    }
}


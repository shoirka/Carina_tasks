package marat.week06;

/**
 * Java Coding Tasks - Week6
 * <p>
 * String_SumOfAllDigits
 * Write a method that can return the sum of the digits in a string
 * Ex:  "12 java 5 apple 3"  ==>  20
 */
public class String_SumOfAllDigits {
    public static int sumOfAllDigits(String str) {
        String[] arr = str.split(" ");
        int result = 0;
        for (String word : arr) {
            for (int i = 0; i < word.length(); i++) {
                if (Character.isDigit(word.charAt(i))) {
                    result += Integer.parseInt(word);
                }
                break;
            }
        }
        return result;
    }
}

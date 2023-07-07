package olena.week_6;
/**
 *  Java Coding Tasks - Week6
 *
 *   String_SumOfAllDigits
 * Write a method that can return the sum of the digits in a string
 * Ex:  "12 java 5 apple 3"  ==>  20
 */
public class String_SumOfAllDigits {

    public static int sumOfDigits(String str) {
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isDigit(c)) {
                int digit = Character.getNumericValue(c);
                sum += digit;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        String str = "12 java 5 apple 3";
        int sum = sumOfDigits(str);
        System.out.println("Sum of digits: " + sum);
    }
}
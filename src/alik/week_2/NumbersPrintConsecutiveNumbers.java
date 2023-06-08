package alik.week_2;

/**
 * Numbers -- print consecutive numbers
 * Write a function that, given a positive integer N, prints the consecutive numbers from 1 to N, each on a separate line.
 * However, any number divisible by 2, 3 or 5 should be replaced by the word Codility, Test or Coders respectively.
 * If a number is divisible by more than one of the numbers: 2,3 or 5, it should be replaced by a concatenation of
 * the respective words Codility, Test and Coders in this given order. For example, numbers divisible by both 2 and 3
 * should be replaced by CodilityTest and numbers divisible by all three numbers: 2,3 and 5, should be replaced by
 * CodilityTestCoders.
 * <p>
 * For example, here is the output for N = 17:
 * 1
 * Codility
 * Test
 * Codility
 * Coders
 * CodilityTest
 * 7
 * Codility
 * Test
 * CodilityCoders
 * 11
 * CodilityTest
 * 13
 * Codility
 * TestCoders
 * Codility
 */
public class NumbersPrintConsecutiveNumbers {
    public static void printConsecutiveNumbers(int n) {
        for (int i = 1; i <= n; i++) {
            String text = i % 2 == 0 ? "Codility" : "";
            text += i % 3 == 0 ? "Test" : "";
            text += i % 5 == 0 ? "Coders" : "";
            if (text.isEmpty()) {
                text = String.valueOf(i);
            }
            System.out.println(text);
        }
    }

    public static void main(String[] args) {
        printConsecutiveNumbers(100);
    }
}

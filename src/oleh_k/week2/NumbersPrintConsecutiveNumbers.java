package oleh_k.week2;

import java.util.ArrayList;
import java.util.List;

/**
 * Numbers -- print consecutive numbers
 * Write a function that, given a positive integer N, prints the consecutive numbers from 1 to N, each on a separate line. However, any number divisible by 2, 3 or 5 should be replaced by the word Codility, Test or Coders respectively. If a number is divisible by more than one of the numbers: 2,3 or 5, it should be replaced by a concatenation of the respective words Codility, Test and Coders in this given order. For example, numbers divisible by both 2 and 3 should be replaced by CodilityTest and numbers divisible by all three numbers: 2,3 and 5, should be replaced by CodilityTestCoders.
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
    public static List<String> numbers(int start, int end) {
        List<String> result = new ArrayList<>();
        for (int i = start; i < end; i++) {
            if (i % 2 == 0 && i % 5 == 0) {
                result.add("CodilityCoders");
            } else if (i % 3 == 0 && i % 5 == 0) {
                result.add("TestCoders");
            } else if (i % 2 == 0 && i % 3 == 0) {
                result.add("CodilityTest");
            } else if (i % 2 == 0) {
                result.add("Codility");
            } else if (i % 3 == 0) {
                result.add("Test");
            } else if (i % 5 == 0) {
                result.add("Coders");
            } else {
                result.add(i + "");
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> numbers = numbers(1, 100);
        System.out.println(numbers);
    }
}

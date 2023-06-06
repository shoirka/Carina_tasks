package oleh_k.week_3;

import java.util.ArrayList;
import java.util.List;

/**
 * Numbers -- PrimeNumber
 * Write a method that can check if a number is prime or not
 */
public class NumbersPrimeNumber {
    public static boolean isPrimeNumber(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        List<Integer> numbers=new ArrayList<>();
        for (int i = 0; i <= 100; i++) {
            numbers.add(i);
        }
        StringBuilder answer=new StringBuilder();
        for (Integer each : numbers) {
            answer=(isPrimeNumber(each))?answer.append(" is prime number"):answer.append(" is NOT prime number");
            System.out.println(each+""+answer);
            answer.setLength(0);
        }
    }
}

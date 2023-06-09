package alik.week_3;

/**
 * Numbers -- PrimeNumber
 * Write a method that can check if a number is prime or not
 */
public class NumbersPrimeNumber {

    public static boolean isPrime(int number) {
        for (int i = 2; i <= number - 1; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int number = 17;
        System.out.println(number + (isPrime(number) ? " is prime" : " is not prime"));

        number = 15;
        System.out.println(number + (isPrime(number) ? " is prime" : " is not prime"));
    }

}

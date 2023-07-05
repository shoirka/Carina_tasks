package Ara.week_3;

/**
 *  Numbers -- PrimeNumber
 * Write a method that can check if a number is prime or not
 */
public class NumbersPrimeNumber {

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;

        }

        // Check for divisibility from 2 to the square root of the number
        for (int i = 1; i < number; i++) {



            if (!(number % i == 0)) {
                return false;


            }
        }

        return true;
    }

    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            System.out.println( "number " + i +  (isPrime(i) ? " is Prime" : " is not Prime" ) );
        }


    }

}

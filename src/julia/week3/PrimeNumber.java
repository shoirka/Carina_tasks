package julia.week3;

public class PrimeNumber {

/*
Write a method that can check if a number is prime or not
*/

    // prime number is the number that has two factors: 1 and itself
    // example: 2, 3, 5, 7, 9, 11
    // 2 is divisible by 1 and itself; 3 is divisible by 1 and itself, etc.

    // I will create a method that will return boolean as result
    // int parameter
    public static boolean primeNumber(int num) {
        // we check for the condition when the number is 1 or less than one (zero)
        if (num <= 1) {
            return false; // division by zero gives zero and 1 is the number that does not have two factors
        }
        // then we check if the number is divisible by any integer from 2 to the value of num
        // we start iteration from 2
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    return false; // The number is divisible by i (2), so it is not prime
                }
            }

            return true; // The number is only divisible by 1 and itself, so it is prime
        }


        public static void main (String[]args){
            int number = 6;
            System.out.println(primeNumber(number));

        }
    }


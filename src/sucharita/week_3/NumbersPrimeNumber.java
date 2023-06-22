package sucharita.week_3;

/**
 *  Numbers -- PrimeNumber
 * Write a method that can check if a number is prime or not
 */
public class NumbersPrimeNumber {
    public static boolean prime(int x) {
        if(x<=1) {
            return false;
        }
            for (int i = 2; i < x; i++) {
                if (x % i == 0) {
                    return false;
                }
            }

        return true;
    }

    public static void main(String[] args) {


        System.out.println(prime(6));
    }
}

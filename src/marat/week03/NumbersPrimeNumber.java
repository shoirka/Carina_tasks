package marat.week03;

/**
 * Numbers -- PrimeNumber
 * Write a method that can check if a number is prime or not
 */
public class NumbersPrimeNumber {
    public static boolean isPrime(int num) {

        int count = 0;

        for (int i = 1; i <= num; i++) {
            String str = "";
            str = "" + ((double) num / i);
            String str2 = str.substring(str.indexOf(".") + 1);
            if (!(str2.contains("1") ||
                    str2.contains("2") ||
                    str2.contains("3") ||
                    str2.contains("4") ||
                    str2.contains("5") ||
                    str2.contains("6") ||
                    str2.contains("7") ||
                    str2.contains("8") ||
                    str2.contains("9"))) {
                count++;
            }
        }
        if (count > 2) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        System.out.println(isPrime(11));
    }
}

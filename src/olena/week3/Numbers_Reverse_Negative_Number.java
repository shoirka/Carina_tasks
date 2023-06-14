package olena.week3;
/*
Write a return method that can reverse digits of a negative number and return it as int
input: -35  output: -53
 */
public class Numbers_Reverse_Negative_Number {

//public static void reverseNegative()


    public static int reverseNegativeNumber(int num) {
        int reverse = 0;
        boolean negative = false;

        if (num < 0) {
            negative = true;
        }

        while (num > 0) {
            reverse = reverse * 10 + num % 10;
            num = num / 10;
        }

        if (negative) {
            reverse = reverse * -1;
        }

        return reverse;
    }

    public static void main(String[] args) {

    }
}

package julia.week3;

public class Reverse_Negative {

    public static int reverseNegative(int num) {

        if (num < 10 && num >= 0) {
            return num;
        }

        int reverse = 0;

        while (num != 0) {
            reverse = reverse * 10; //
            reverse = reverse + num % 10; //
            num = num / 10;
        }
        return reverse;
    }


    public static void main(String[] args) {

        System.out.println(reverseNegative(-19)); // 91
    }
}


/*
Write a return method that can reverse digits of a negative number and return it as int
input: -35  output: -53
*/

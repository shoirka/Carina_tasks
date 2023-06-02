package aaron.week_3;
//Write a return method that can reverse digits of a negative number and return it as int
//input: -35  output: -53
public class Numbers_Reverse_Negative_Number {
    public static void main(String[] args) {
        System.out.println(reverse(-35));
        System.out.println(reverseNum(-53));

    }
    public static int reverse(int number) {
        if (number < 10 && number >= 0) {
            return number;
        }
        int result = 0;
        while (number != 0) {
            result = result * 10 + number % 10;
            number /= 10;
        }
        return result;
    }

    public static int reverseNum(int num) {
        String str = new StringBuilder("" + num).reverse().toString();
        if (num < 0) {
            str = "-" + str.substring(0, str.length() - 1);
        }
        return Integer.valueOf(str);
    }
}

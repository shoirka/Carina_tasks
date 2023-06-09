package marat.week3;

public class Numbers_Reverse_Negative_Number {
    public static int reverseNegative(int num) {
        String str = "";
        String str2 = "";
        if (num < 0) {
            str += "" + num;
        }
        for (int i = str.length() - 1; i >= 0; i--) {
            if (i > 0) {
                str2 += str.charAt(i);
            }
        }
        String str3 = "-" + str2;
        Integer result = Integer.parseInt(str3);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(reverseNegative(-12));
    }

}
/*
Write a return method that can reverse digits of a negative number and return it as int
input: -35  output: -53
 */
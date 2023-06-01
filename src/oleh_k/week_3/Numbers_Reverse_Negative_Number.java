package oleh_k.week_3;

public class Numbers_Reverse_Negative_Number {
    // 349.0
    public static int reverseNumber(int number) {
        String str = number + "";
        StringBuilder result = new StringBuilder();
        int sign = 1;
        if (str.contains("-")) {
            str = str.replace("-", "");
            sign = -1;
        }
        for (int i = str.length() - 1; i >= 0; i--) {
            result.append(str.charAt(i));
        }
        return Integer.parseInt(result + "") * sign;
    }

    public static void main(String[] args) {
        int number = -35;
        System.out.println("Before: " + number);
        System.out.println("After: " + reverseNumber(number));
    }
}

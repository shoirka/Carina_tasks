package alik.week_1;

public class DivisionWithoutOperator {

    private static int divideInt(double a, double b)  {
        if (b == 0) {
            throw new ArithmeticException("Divizion by zero");
        }

        int result = 0;
        while (a >= b) {
            a -= b;
            result++;
        }
        return result;
    }

    public static double divide(double a, double b) {
        final int PRECISION = 10;
        boolean negativeResult = (a < 0) ^ (b < 0);
        a = Math.abs(a);
        b = Math.abs(b);
        int intResult = divideInt(a, b);
        String result = String.valueOf(intResult);
        result += ".";
        int p = 0;
        while (p < PRECISION) {
            a = a - intResult * b; //reminder
            a *= 10;
            intResult = divideInt(a, b);
            result += String.valueOf(intResult);

            p++;
        }
        System.out.println(result);

        return negativeResult
                ? -Double.parseDouble(result)
                : Double.parseDouble(result);
    }

    public static void main(String[] args) {
        System.out.println(divide(10, -0.07));
    }

}
/*
 Numbers - Divide without / operator:
Write a method that can divide two numbers without using division operat
 */
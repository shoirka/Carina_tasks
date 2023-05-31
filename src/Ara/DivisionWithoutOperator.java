package Ara;

public class DivisionWithoutOperator {


    public static int divide(int x, int y) {
        // Can not divide by zero. Handling ArithmeticException.
        if (y == 0) {
            throw new ArithmeticException("Can not divide by zero");
        }


        boolean isNegative = ((x < 0) && (y > 0)) || ((x > 0) && (y < 0)); //negative numbers

        x = Math.abs(x);  // absolute value of x
        y = Math.abs(y);  // absolute value of y

        int count = 0;
        while (x >= y) {
            x -= y;
            count++;
        }

        return isNegative ? -count : count;
    }
}

/*
 Numbers - Divide without / operator:
Write a method that can divide two numbers without using division operat
 */
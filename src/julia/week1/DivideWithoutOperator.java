package julia.week1;

public class DivideWithoutOperator {

    /*
    Write a method that can divide two numbers without using division operator
     */

    public static int divideWithoutOperator(int dividend, int divisor) {
        // Handle division by zero
        if (divisor == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }

        // Handle division of dividend by 1
        if (divisor == 1) {
            return dividend;
        }

        // Determine the sign of the result
        int sign = (dividend < 0 ^ divisor < 0) ? -1 : 1;

        // Convert dividend and divisor to positive
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);

        // Perform division using repeated subtraction
        int quotient = 0;
        while (dividend >= divisor) {
            dividend -= divisor;
            quotient++;
        }

        return sign * quotient;
    }
/*
    public static int divide(int a, int b){
        int c = 0;
        while(1){
          a -= b;
        if (a >= 0)
            c++;
            else
                break;
        }
        return c;
        }
    }

 */
}

